function NavBar() {
  return (
    <div
      className="flex justify-between items-center px-8 py-4 
    bg-black/40 backdrop-blur-md border-b border-white/10 
    sticky top-0 z-50"
    >
      {/* Logo */}
      <div className="text-xl font-semibold text-white tracking-wide cursor-pointer hover:opacity-80 transition">
        Sky Explorer ✈︎
      </div>

      {/* Menu */}
      <div className="hidden md:flex gap-10 text-white/80 font-medium">
        <div className="hover:text-white hover:scale-105 transition cursor-pointer">
          Features
        </div>
        <div className="hover:text-white hover:scale-105 transition cursor-pointer">
          Method
        </div>
        <div className="hover:text-white hover:scale-105 transition cursor-pointer">
          Price
        </div>
        <div className="hover:text-white hover:scale-105 transition cursor-pointer">
          Changelog
        </div>
      </div>

      {/* Button */}
      <button
        className="px-6 py-2 rounded-full 
      bg-white text-black font-semibold 
      hover:bg-gray-200 hover:scale-105 
      transition duration-300 shadow-md"
      >
        Log in
      </button>
    </div>
  );
}

export default NavBar;
