const courses = [
    {
        courseName: "HTML",
        duration: "10 days",
        description: " HTML is used for creating web pages and embedding objects and images into text. By using HTML, one can design interactive forms and other web elements.",
        Image: "https://cdn.iconscout.com/icon/premium/png-256-thumb/html-2752158-2284975.png?f=webp",
        Video: '<iframe width="1000" height="500" src="https://www.youtube.com/embed/qz0aGYrrlhU?si=EZ5dmu0zWHFZo9hf" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>'

    },
    {
        courseName: "CSS",
        duration: "20 days",
        description: "Cascading Style Sheets (CSS) is a stylesheet language used to describe the presentation of a document written in HTML or XML (including XML dialects such as SVG, MathML or XHTML).",
        Image: "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/CSS3_logo.svg/2048px-CSS3_logo.svg.png",
        Video: '<iframe width="1000" height="500" src="https://www.youtube.com/embed/vfs1wBDoqBY?si=g1G0bLN0YsLn9R4j" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>'
    },
    {
        courseName: "Bootstrap",
        duration: "5 days",
        description: " Bootstrap is a free, open source front-end development framework for the creation of websites and web apps. Designed to enable responsive development of mobile-first websites, Bootstrap provides a collection of syntax for template designs..",
        Image: "https://ncarb.github.io/bootstrap/assets/img/bootstrap-stack.png",
        Video: '<iframe width="1000" height="500" src="https://www.youtube.com/embed/AS5NRIo_Vyo?si=fMW5f0i02ButKnk8" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>'
    },
    {
        courseName: "JavaScript",
        duration: "15 days",
        description: " JavaScript is a scripting language that enables you to create dynamically updating content, control multimedia, animate images, and pretty much everything else.",
        Image: "https://seeklogo.com/images/N/node-js-logo-A40EA2F21E-seeklogo.com.png",
        Video: '<iframe width="1000" height="500" src="https://www.youtube.com/embed/poo0BXryffI?si=WVehA1s8cNKAjN0O" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>'
    },
    {
        courseName: "React.Js",
        duration: "15 days",
        description: " React. js, more commonly known as React, is a free, open-source JavaScript library. It works best to build user interfaces by combining sections of code (components) into full websites. Originally built by Facebook, Meta and the open-source community now maintain it.",
        Image: "https://www.svgrepo.com/show/327388/logo-react.svg",
        Video: '<iframe width="1000" height="500" src="https://www.youtube.com/embed/EVdh8DCLnA0?si=QR3fs2JEUq9hpreZ" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>'
    },
    {
        courseName: "Node.Js",
        duration: "10 days",
        description: "Node. js (Node) is an Open Source, cross-platform runtime environment for executing JavaScript code. Node is used extensively for server-side programming, making it possible for developers to use JavaScript for client-side and server-side code without needing to learn an additional language.",
        Image: "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Node.js_logo.svg/21000px-Node.js_logo.svg.png",
        Video: '<iframe width="1000" height="500" src="https://www.youtube.com/embed/SdyzXQoQO18?si=0GKXELUaBULrMzmg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>'
    },
    {
        courseName: "Express.js",
        duration: "10 days",
        description: " Express is a node js web application framework that provides broad features for building web and mobile applications. It is used to build a single page, multipage, and hybrid web application. It's a layer built on the top of the Node js that helps manage servers and routes.",
        Image: "https://cdn.icon-icons.com/icons2/2699/PNG/512/expressjs_logo_icon_169185.png",
        Video: '<iframe width="1000" height="500" src="https://www.youtube.com/embed/KUoBYPMbaps?si=EQSeZLHjgJQ5LPk8" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>'
    },
    {
        courseName: "Java",
        duration: "30 days",
        description: "Java is a multi-platform, object-oriented, and network-centric language that can be used as a platform in itself. It is a fast, secure, reliable programming language .",
        Image: "https://logos-world.net/wp-content/uploads/2022/07/Java-Logo.png",
        Video: '<iframe width="1000" height="500" src="https://www.youtube.com/embed/yC9ZwDfT3b0?si=CVcfzVWkvDT-CZWM" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>'
    },
    {
        courseName: "MongodB",
        duration: "20 days",
        description: "MongoDB Atlas, the Cloud-Native Document Database as a Service. The Easiest Way to Deploy, Operate, and Scale MongoDB in the Cloud in Just a Few Clicks. Continuous Backups. Quick Setup. Enhanced Reliability..",
        Image: "https://assets-global.website-files.com/6064b31ff49a2d31e0493af1/63a57609d46c17284c36a721_mongodb.svg",
        Video: '<iframe width="1000" height="500" src="https://www.youtube.com/embed/KD-2vh9v1co?si=otX-MHSxseQWUKMv" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>'
    },
    {
        courseName: "My Sql",
        duration: "20 days",
        description: "MySQL is a relational database management system The database structure is organized into physical files optimized for speed.  ",
        Image: "https://styles.redditmedia.com/t5_2qm6k/styles/communityIcon_dhjr6guc03x51.png",
        Video: '<iframe width="1000" height="500" src="https://www.youtube.com/embed/7S_tz1z_5bA?si=EQWbB2GO1Uqm_P82" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>'
    },

];


localStorage.setItem("courses", JSON.stringify(courses))
console.log(courses)



