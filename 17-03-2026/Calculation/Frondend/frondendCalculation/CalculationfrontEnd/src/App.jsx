import { useState } from "react";
import axios from "axios";

function App() {

  const [num1, setNum1] = useState(0);
  const [num2, setNum2] = useState(0);
  const [result, setResult] = useState(0);

  const handleCalculate = (e) => {
    e.preventDefault();
    axios

      .post("http://localhost:8080/add", {
        num1: parseInt(num1),
        num2: parseInt(num2)
      })
      .then((response) => {
        console.log(response.data);
        setResult(response.data);
      })
      .catch((error) => console.log(error));
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>Simple Calculator</h2>
      <form onSubmit={handleCalculate}>
        <div>
          <label>Number 1:
            <input type="number" value={num1} onChange={(e) => setNum1(e.target.value)} required />
          </label>
        </div>
        <div>
          <label>Number 2:
            <input type="number" value={num2} onChange={(e) => setNum2(e.target.value)} required />
          </label>
        </div>
        <button type="submit">Calculate</button>
      </form>
      <h3>Result: {result}</h3>
    </div>
  )

}
export default App;