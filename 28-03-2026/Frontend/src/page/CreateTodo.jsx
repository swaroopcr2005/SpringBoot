import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { createTodo } from "../services/todoService";

export default function CreateTodo() {
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");

  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      await createTodo({ title, description });
      navigate("/");
    } catch (error) {
      console.log(error);
    }
  };

 return (
   <div className="form-container">
     <h2>Create Todo</h2>

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
         Create
       </button>
     </form>
   </div>
 );
}
