import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import About from "./pages/About";
import Contect from "./pages/Contect";

function App(){
  return(
    <>
    <BrowserRouter>
    <Routes>
      <Route path="/"element={<Home/>}/>
      <Route path="/About" element={<About/>}/>
      <Route path="/Contect" element={<Contect/>}/>
      </Routes></BrowserRouter>
    </>
  );

}
export default App;