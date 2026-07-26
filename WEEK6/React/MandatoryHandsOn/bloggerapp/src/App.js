import React from "react";
import CourseDetails from "./CourseDetails";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";

function App() {

  const showCourse = true;
  const showBook = true;
  const showBlog = true;

  return (
    <div style={{ display: "flex", justifyContent: "space-around", marginTop: "40px" }}>

      {showCourse && (
        <div style={{ borderRight: "4px solid green", paddingRight: "40px" }}>
          <CourseDetails />
        </div>
      )}

      {showBook ? (
        <div style={{ borderRight: "4px solid green", paddingRight: "40px" }}>
          <BookDetails />
        </div>
      ) : null}

      {showBlog && <BlogDetails />}

    </div>
  );
}

export default App;