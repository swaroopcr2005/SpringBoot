import { useState } from "react";

function Numberadd() {
    const [num1, setNum1] = useState();
    const [num2, setNum2] = useState();
    const[result,setResult]=useState();

    // function add(){
    //     setResult(Number(num1)+Number(num2))
    // }

    const handleAdd=()=>{
        setResult(Number(num1)+Number(num2));
    };


    return (
        <>
            <input type="number" value={num1} onChange={(e) => setNum1(e.target.value)}
            />
            <input type="number" value={num2} onChange={(e) => setNum2(e.target.value)}
            />
            
       {/* <button onClick={add}>add it  </button> */}
       <button onClick={handleAdd}>add it  </button>

            <h1>additoin of number {num1} and {num2}
            </h1>
            <h1>total= {result}</h1>
        </>
    );
}
export default Numberadd;