const loginForm = document.getElementById("register-form");

loginForm.addEventListener("submit", function (event) {
  // prevent default submission
  event.preventDefault();

  // get form data
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;

  // send data to backend
  fetch("http://localhost:8080/api/register", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      name: name,
      email: email,
      password: password,
    }),
  })
    .then(function (response) {
      return response.json;
    })
    .then(function (data) {
      console.log(data);
    })
    .catch(function (error) {
      console.error("Error:", error);
    });
});
