import { useState } from "react";

function GradingSystem() {

    const [num, setNum] = useState();
    const [grade, setGrade] = useState();

    const grading = () => {

        if (num < 0 || num > 100) {
            setGrade("Invalid number");
        }
        else if (num >= 85) {
            setGrade("A");
        }
        else if (num >= 75) {
            setGrade("B");
        }
        else if (num >= 65) {
            setGrade("C");
        }
        else if (num >= 55) {
            setGrade("D");
        }
        else if (num >= 45) {
            setGrade("E");
        }
        else {
            setGrade("f");
        }
    };
    return (
  <>
            <input type="number" onChange={(e) => setNum(e.target.value)} />
            <h1><button onClick={grading}>result</button></h1>
            <h2>{grade}</h2>
        </>
    );

}
export default GradingSystem;