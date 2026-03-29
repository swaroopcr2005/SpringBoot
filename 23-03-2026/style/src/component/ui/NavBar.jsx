function NavBar(){
    return (
      <div className="flex justify-between px-5 py-5 bg-pink-300 hover:bg-black hover:text-white">
        <div className="flex gap-5">
          <div className="font-bold">
            Logo
          </div>
          <div className="font-bold">JCBM collage</div>
        </div>

        <div className="flex gap-5">
          <div className="font-bold hover:text-pink-400">Home</div>
          <div className="font-bold  hover:text-pink-400">About us</div>
          <div className="font-bold  hover:text-pink-400">Service</div>
          <div className="font-bold  hover:text-pink-400">Feed back</div>
        </div>
        <div className="flex gap-5">
          <div>
            <button className=" border rounded-md px-4 py-2 bg-pink-500 font-bold">
              Sign up
            </button>
          </div>
          <div>
            <button className=" border rounded-md px-4 py-2 bg-pink-500 font-bold">
              Log in
            </button>
          </div>
        </div>
      </div>
    );
}
export default NavBar;