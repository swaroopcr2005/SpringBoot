function Search() {
  return (
    <div className="flex justify-center mt-10 px-4">
      {/* Search Container */}
      <div
        className="flex items-center gap-3 
      bg-white/10 backdrop-blur-md 
      border border-white/20 
      rounded-full px-4 py-3 shadow-lg"
      >
        {/* From */}
        <input
          type="text"
          placeholder="From"
          className="bg-transparent outline-none text-white 
          placeholder-white/60 px-4 py-2 w-32 md:w-40"
        />

        {/* Divider */}
        <div className="h-6 w-px bg-white/30"></div>

        {/* To */}
        <input
          type="text"
          placeholder="To"
          className="bg-transparent outline-none text-white 
          placeholder-white/60 px-4 py-2 w-32 md:w-40"
        />

        {/* Button */}
        <button
          className="bg-white text-black font-semibold 
        px-6 py-2 rounded-full 
        hover:bg-gray-200 hover:scale-105 
        transition duration-300"
        >
          Search
        </button>
      </div>
    </div>
  );
}

export default Search;
