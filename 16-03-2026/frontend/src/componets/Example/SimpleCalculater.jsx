import { useState } from "react";

function Calculater() {
    const [num1, setnum1] = useState();
    const [num2, setnum2] = useState();
    const [result, setresult] = useState();

    function add() {
        setresult(Number(num1) + Number(num2))
    }
    function sub() {
        setresult(Number(num1) - Number(num2))
    }
    function multy() {
        setresult(Number(num1) * Number(num2))
    }
    function div() {
        setresult(Number(num1) / Number(num2))
    }

    return (
        <>
            <input type="number" value={num1} onChange={(e) => setnum1(e.target.value)} placeholder="enter number"
            />
            <input type="number" value={num2} onChange={(e) => setnum2(e.target.value)} placeholder="enter number"
            />

            <button onClick={add}>add it  </button>
            <button onClick={sub}>sub it  </button>
            <button onClick={multy}>multy it  </button>
            <button onClick={div}>div it  </button>


            <h1>{result}</h1>
            {/* <h12>addition: {result}</h12> */}

        </>
    );

}
export default Calculater;