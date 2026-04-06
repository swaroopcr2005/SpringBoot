import { useEffect } from "react";
import { useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { getTodoById, updateTodo } from "../services/todoService";

function EditTodo() {
  const { id } = useParams();
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");
  const navigate = useNavigate();

  useEffect(() => {
    const fetchTodo = async () => {
      const data = await getTodoById(id);
      setTitle(data.title || "");
      setDescription(data.description || "");
    };

    fetchTodo();
  }, [id]);

  // handle update
  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      await updateTodo(id, { title, description });
      navigate("/");
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <div className="form-container">
      <h2>Edit Todo</h2>

      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label>Title</label>
          <input
            type="text"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
            required
          />
        </div>

        <div className="form-group">
          <label>Description</label>
          <input
            type="text"
            value={description}
            onChange={(e) => setDescription(e.target.value)}
            required
          />
        </div>

        <button className="btn" type="submit">
          Update
        </button>
      </form>
    </div>
  );
}
export default EditTodo;

