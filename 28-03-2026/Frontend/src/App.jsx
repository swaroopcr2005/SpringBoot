import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import TodoList from "./page/TodoList";
import CreateTodo from "./page/CreateTodo";
import EditTodo from "./page/EditTodo";

export default function App() {
  return (
    <BrowserRouter>
      {/* Simple Navigation */}
      <nav>
        <Link to="/">Home</Link> | <Link to="/create">Create</Link>
      </nav>

      <hr />

      {/* Routes */}
      <Routes>
        <Route path="/" element={<TodoList />} />
        <Route path="/create" element={<CreateTodo />} />
        <Route path="/edit/:id" element={<EditTodo />} />
      </Routes>
    </BrowserRouter>
  );
}
