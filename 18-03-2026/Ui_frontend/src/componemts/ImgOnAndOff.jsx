import { useState } from "react";

function ImgOnAndOff() {
    const [count, setCount] = useState();
    const switchFunction = () => {
        setCount(!count);
    };
    return (
        <>
            <div>
                {count && <div>True</div>}
                {!count && <div>False</div>}
                <button onClick={switchFunction}>update State</button>
            </div>
        </>
    );
}
export default ImgOnAndOff;