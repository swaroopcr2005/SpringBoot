import { useState } from "react";

function GuessNumber() {
  const [randomNumber, setRandomNumber] = useState(0);
  const [num, setNum] = useState(0);
  const [result, setResult] = useState(0);

  const generateRandom = () => {
    const randomNum = Math.floor(Math.random() * 5) + 1;
    setRandomNumber(randomNum);

    if (Number(num) === randomNum) {
      setResult("Right");
    } else {
      setResult("Wrong");
    }

   
  };

  return (
    <div>
      <input
        type="number"
        value={num}
        onChange={(e) => setNum(e.target.value)}
      />

      <button onClick={generateRandom}>Generate</button>

      <div>{result}</div>


       {randomNumber !== 0 && (
        <div>Generated Number: {randomNumber}</div>
      )} 
    </div>
  );
}

export default GuessNumber;