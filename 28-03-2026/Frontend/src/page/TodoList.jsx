import { useEffect, useState } from "react";
import { deleteTodo, getAllTodos } from "../services/todoService";
import { Navigate, useNavigate } from "react-router-dom";

export default function TodoList() {
  const [todos, setTodos] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    const fetchTodos = async () => {
      try {
        const data = await getAllTodos();
        setTodos(data);
      } catch (error) {
        console.log(error);
      }
    };

    fetchTodos();
  }, []);

  const handleDelete = async (id) => {
    try {
      await deleteTodo(id);
      const data = await getAllTodos();
      setTodos(data);
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <div>
      <h2>Todo List Page</h2>

      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Description</th>
            <th>Edit</th>
            <th>Delete</th>
          </tr>
        </thead>

        <tbody>
          {todos.map((todo) => (
            <tr key={todo.id}>
              <td>{todo.id}</td>
              <td>{todo.title}</td>
              <td>{todo.description}</td>
              <td>
                <button onClick={() => navigate(`/edit/${todo.id}`)}>Update</button>
              </td>
              <td>
                <button onClick={() => handleDelete(todo.id)}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

