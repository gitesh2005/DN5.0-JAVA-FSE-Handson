import React, { useState } from "react";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Element Variable
  let page;

  if (isLoggedIn) {
    page = (
      <div>
        <h2>User Page</h2>
        <p>Flight Details</p>
        <button>Book Ticket</button>
      </div>
    );
  } else {
    page = (
      <div>
        <h2>Guest Page</h2>
        <p>Flight Details</p>
      </div>
    );
  }

  return (
    <div>
      <h1>Ticket Booking App</h1>

      {isLoggedIn ? (
        <button onClick={() => setIsLoggedIn(false)}>
          Logout
        </button>
      ) : (
        <button onClick={() => setIsLoggedIn(true)}>
          Login
        </button>
      )}

      <hr />

      {page}
    </div>
  );
}

export default App;