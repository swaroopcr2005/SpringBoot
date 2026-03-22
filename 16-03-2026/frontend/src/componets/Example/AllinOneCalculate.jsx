import { useState } from "react";

function Calc(){
    const [expression,setExpression]=useState();
    const[result,setResult]=useState();
    const Calculater=()=>{
        try{
            setResult(eval(expression));
        }catch{
            setResult("inavlid expression");
        }
    };
    return(
        <>
        <input type="text" value={expression} onChange={(e)=>setExpression(e.target.value)}/>
        <button onClick={Calculater}></button>

        <h2>calculation:{result}</h2>
        </>
    );
    
}
export default Calc;