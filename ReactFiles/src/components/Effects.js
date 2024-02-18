import React, { useEffect, useState } from "react";
import "./Task/Task1.css";

// const Effects = () =>{
//     const [first, setFirst]= useState();
//     const [refresh, setRefresh] = useState(false)

//     useEffect(() => {
//         fetch("https://api.quotable.io/random")
//         .then((Response) => Response.json())
//         .then((data) => {
//             setFirst(data.content);
//             setRefresh(true);
//          });
//     }, [refresh]);
//     return(
//         <>
//         <div>
//             <h1>random quote</h1>
//             <p>{first}</p>
//             <input type="button" value="refresh quote" onClick={()=>setRefresh()}/>
//         </div>
//         </>
//     )
// };

function Effects() {
  const [nav, setNav] = useState([]);
  useEffect(() => {
    fetch("https://fakestoreapi.com/products")
      .then((res) => res.json())
      .then((data) => {
        console.log(data);
        setNav(data);
      });
  }, []);
  return (
    <>
      {nav.map((a) => {
        return (
          <div>
            <table border="2px">
              <tbody>
                <tr>
                  <th>ID</th>
                  <th>Name</th>
                  <th>price</th>
                  <th>descripsion</th>
                  <th>image</th>
                  <th>rate</th>
                  <th>count</th>
                </tr>
              </tbody>
              <tr>
                <td>{a.id}</td>
                <td>{a.title}</td>
                <td>{a.price}</td>
                <td>{a.description}</td>
                <td>
                  <img
                    src={a.image}
                    style={{ height: "100px", width: "100px" }}
                  />
                </td>
                <td>{a.rating.rate}</td>
                <td>{a.rating.count}</td>
              </tr>
            </table>
          </div>
        );
      })}
    </>
  );
}

export default Effects;
