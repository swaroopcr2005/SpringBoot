import { useEffect, useState } from "react";
import { Link } from "react-router-dom";

export default function Home(){
    const [fruitInput, setFruitIput] = useState("");
    const [fruit, setFruit] = useState(() => {
      const saved = localStorage.getItem("fruit");
      return saved ? JSON.parse(saved) : [];
    });
    useEffect(() => {
      localStorage.setItem("fruit", JSON.stringify(fruit));
    }, [fruit]);

    const handleAddFruit = () => {
      if (fruitInput.trim() === "") return;
      setFruit([...fruit, fruitInput]);
      setFruitIput("");
    };

    const handleDeleteFruit = (index) => {
      const update = fruit.filter((_, i) => i !== index);
      setFruit(update);
    };

    return (
      <>
        <div>
          <h2>home page</h2>
          <Link to={"/"}>home</Link>
          <div/>
          <Link to={"/about"}>about us</Link>
          <div/>
          <input
            type="text"
            placeholder="enter fruit name"
            value={fruitInput}
            onChange={(e) => setFruitIput(e.target.value)}
          />
          <button onClick={handleAddFruit}>add fruit</button>
          <ul>
            {fruit.map((fruit, index) => (
              <li key={index}>
                {fruit}
                <button onClick={() => handleDeleteFruit(index)}>
                  delete {index}
                </button>
              </li>
            ))}
          </ul>
        </div>
      </>
    );

}