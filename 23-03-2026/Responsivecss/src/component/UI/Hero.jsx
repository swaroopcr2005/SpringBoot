function Hero() {
  return (
    <div
      className="h-screen flex flex-col justify-center items-center 
    text-center px-6 bg-gradient-to from-black via-gray-900 to-black text-white"
    >
      {/* Main Heading */}
      <h1 className="text-5xl md:text-6xl font-bold leading-tight">
        Find the best flight ✈︎
      </h1>

      {/* Sub Heading */}
      <p className="mt-4 text-lg md:text-xl text-white/70 max-w-xl">
        Travel smart, compare prices, and explore the world with the best deals.
      </p>

      {/* CTA Buttons */}
      <div className="mt-8 flex gap-4">
        <button
          className="px-6 py-3 rounded-full 
        bg-white text-black font-semibold 
        hover:bg-gray-200 hover:scale-105 transition duration-300 shadow-lg"
        >
          Get Started
        </button>

        <button
          className="px-6 py-3 rounded-full 
        border border-white/30 text-white 
        hover:bg-white/10 hover:scale-105 transition duration-300"
        >
          Learn More
        </button>
      </div>
    </div>
  );
}

export default Hero;
