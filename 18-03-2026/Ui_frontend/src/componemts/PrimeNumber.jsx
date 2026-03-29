import { useState } from "react";

function PrimeNumber() {

    const [num, setNum] = useState();
    const [result, setResult] = useState(null);

    const checkprime = () => {

        if (num <= 1) {
            setResult(false);
            return;
        }

        for (let i = 2; i <= num / 2; i++) {
            if (num % i === 0) {
                setResult(false);
                return; 
            }
        }

        setResult(true);
    };

    return (
        <div>
            <input
                type="number"
                placeholder="enter number"
                value={num}
                onChange={(e) => setNum(Number(e.target.value))}
            />

            <button onClick={checkprime}>check</button>

            <h1>
                {result === null ? "" : result ? "Prime" : "Not Prime"}
            </h1>
        </div>
    );
}

export default PrimeNumber;