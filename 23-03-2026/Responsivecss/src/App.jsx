import Hero from "./component/ui/Hero";
import NavBar from "./component/ui/NavBar";
import Search from "./component/UI/SearchBox";


function App(){
  return(
    <div
      className="min-h-screen bg-cover bg-center relative"
      style={{
        backgroundImage: "url('/image/bg.jpg')"
      }}>

<NavBar/>
<Hero/>
<Search/>


</div>
  );
}
export default App;