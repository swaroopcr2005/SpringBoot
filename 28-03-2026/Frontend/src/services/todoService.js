import axios from "axios";

const BASE_URL = "http://localhost:8080/todos";

// GET ALL TODOS
export const getAllTodos = async () => {
  const response = await axios.get(BASE_URL);
  return response.data.data;
};

// GET TODO BY ID  ✅ ADD THIS
export const getTodoById = async (id) => {
  const response = await axios.get(`${BASE_URL}/${id}`);
  return response.data.data;
};

// CREATE TODO
export const createTodo = async (todoData) => {
  const response = await axios.post(BASE_URL, todoData);
  return response.data.data;
};

// UPDATE TODO  ✅ ADD THIS
export const updateTodo = async (id, todoData) => {
  const response = await axios.put(`${BASE_URL}/${id}`, todoData);
  return response.data.data;
};

// DELETE TODO
export const deleteTodo = async (id) => {
  await axios.delete(`${BASE_URL}/${id}`);
};
