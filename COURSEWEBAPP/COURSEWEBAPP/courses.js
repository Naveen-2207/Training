// Assuming data is stored in localStorage as "courses"
const coursedetails = () => {
    let data = JSON.parse(localStorage.getItem("courses"));
    console.log(data);
    const coursecard = document.getElementById("coursecard");
    data.forEach((value, index) => {
        let courseDiv = document.createElement("div");
        courseDiv.classList.add("coursecard");
        courseDiv.setAttribute("id", `courseDiv${index}`); // Unique ID for each courseDiv

        const img = document.createElement("img");
        img.src = value.Image;
        img.alt = "Course Image";

        const courseName = document.createElement("p");
        courseName.textContent = value.courseName;
        courseName.classList.add("coursename");

        const courseDescription = document.createElement("p");
        courseDescription.textContent = value.description;

        const courseDuration = document.createElement("p");
        courseDuration.textContent = `Duration: ${value.duration}`;
        courseDuration.classList.add("courseduration");

        const enrollbtn = document.createElement("input");
        enrollbtn.setAttribute("type", "button");
        enrollbtn.setAttribute("value", "ENROLL");
        enrollbtn.setAttribute("id", `enrollbtn${index}`);
        enrollbtn.classList.add("enrollbtn");
        enrollbtn.setAttribute("onclick", `handleEnrollment(${index}, '${value.courseName}')`); // Pass course name

        const startlearn = document.createElement("input");
        startlearn.setAttribute("type", "button");
        startlearn.setAttribute("value", "START LEARN");
        startlearn.setAttribute("id", `startlearn${index}`);
        startlearn.classList.add("startlearn");
        startlearn.setAttribute("onclick", `video(${index})`);
        startlearn.disabled = true; // Initially disable the "START LEARN" button

        courseDiv.appendChild(img);
        courseDiv.appendChild(courseName);
        courseDiv.appendChild(courseDescription);
        courseDiv.appendChild(courseDuration);
        courseDiv.appendChild(enrollbtn);
        courseDiv.appendChild(startlearn);

        coursecard.append(courseDiv);
        localStorage.setItem("coursecount", index + 1);
    });
};
coursedetails();
startLearnBtn.disabled = true;

function handleEnrollment(courseIndex, courseName) {
    if (sessionStorage.getItem("login") !== "true") {
        // Redirect to the login page if not logged in
        window.location.href = "login.html";
    } else {
        // Check if the user has already enrolled in this course
        let enrolledCourses = JSON.parse(localStorage.getItem("enrolledCourses")) || [];
        const isAlreadyEnrolled = enrolledCourses.some(course => course.courseIndex === courseIndex);

        if (isAlreadyEnrolled) {
            alert("You have already enrolled in this course.");
            // return; // Exit the function if the user is already enrolled
        }

        // Change the button text to "ENROLLED" and disable it
        const enrollBtn = document.getElementById(`enrollbtn${courseIndex}`);
        enrollBtn.value = "ENROLLED";
        enrollBtn.disabled = true;

        // Store the user's enrollment details in localStorage
        enrolledCourses.push({ courseIndex: courseIndex, courseName: courseName });
        localStorage.setItem("enrolledCourses", JSON.stringify(enrolledCourses));

        // Enable the "START LEARN" button
        const startLearnBtn = document.getElementById(`startlearn${courseIndex}`);
        startLearnBtn.disabled = false;
        const enrollcount = JSON.parse(localStorage.getItem("enrolledCourses"))
        enrollcount.map((index, value) => {
            console.log(value);
            localStorage.setItem("enrollcount", value + 1)
        })
    }
}

function video(courseIndex) {
    window.location.href = `video.html?courseIndex=${courseIndex}`;
}


