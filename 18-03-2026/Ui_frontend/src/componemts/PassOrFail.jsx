import { useState } from "react";
import z from "zod";

function PassOrFail(){
    const[marks,setMarks]=useState("");
    const [result,setResult]=useState("");

    const schema=z.number().min(0).max(100);

    function checkResult(){
        const parsedNUmber=Number(marks);
        const validation=schema.safeParse(parsedNUmber);

        if(!validation.success){
            setResult("invalid marks");
            return;
        }

        if(parsedNUmber>35){
            setResult("pass");
        }else{
            setResult("fail");
        }
    }
    return(
 <>
            <input type="number" onChange={(e) => setMarks(e.target.value)} />
            <h1><button onClick={checkResult}>result</button></h1>
            <h2>{result}</h2>
        </>

    );


}
export default PassOrFail;
