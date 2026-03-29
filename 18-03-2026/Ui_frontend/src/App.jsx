import { useState } from "react";
import ImgOnAndOff from "./componemts/ImgOnAndOff";
import GuessNumber from "./componemts/GuessNumber";
import GradingSystem from "./componemts/GradingSystem";
import ListDisplay from "./componemts/ListDisplay";
import PrimeNumber from "./componemts/PrimeNumber";
import PassOrFail from "./componemts/PassOrFail";
import ListOfPrimeNumber from "./componemts/ListOfPrimeNumber";

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  return (
    <><>
      <div>total cuont:{count}</div>
      <button onClick={increment}>Add 1</button>
      <button onClick={decrement}>sub 1</button>

    </>

      <ImgOnAndOff />

      <GuessNumber />

      <GradingSystem />

      <ListDisplay />

      <PrimeNumber />

      <ListOfPrimeNumber />

      <PassOrFail />
    </>
  );


}
export default App;