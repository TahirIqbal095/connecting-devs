const registerForm = document.getElementById("register-form");

registerForm.addEventListener("submit",async function (event) {
  // prevent default submission
  event.preventDefault();

  // get form data
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;

  // send data to backend
  const response = await fetch("http://localhost:8080/register", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      name: name,
      email: email,
      password: password,
    }),
  });
});
