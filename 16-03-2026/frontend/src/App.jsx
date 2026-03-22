import Home from "./componets/Home";
import Hello from "./componets/Hello";
import Add from "./componets/Example/Add";
import Addition from "./componets/Example/ParameterAddition";
import Numberadd from "./componets/Example/AddUsingInput";
import Calculater from "./componets/Example/SimpleCalculater";
import Calc from "./componets/Example/AllinOneCalculate";

function App() {
  return (
     <div>
    <Home />

       <Hello name={"swaroop"}
      age={21} />

       <Add />
       <Addition a={10} b={10} />


       <Numberadd />

       <Calculater/>


      <Calc/>

     </div>
  );
}
export default App;