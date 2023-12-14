<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Create Location</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      text-align: center;
    }

    form {
      display: inline-block;
      background-color: #ffffff;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      text-align: left;
    }

    label {
      display: block;
      margin-bottom: 8px;
    }

    input {
      width: 100%;
      padding: 8px;
      margin-bottom: 12px;
      box-sizing: border-box;
    }

    .location-options {
      display: flex;
      align-items: center;
      margin-bottom: 12px;
    }

    .location-options label {
      margin-right: 20px;
    }

    button {
      background-color: #4caf50;
      color: #ffffff;
      padding: 10px 20px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }
  </style>
</head>
<body>

<h1>Welcome Buddy! Create Location from this page. </h1>

<div>
  <form action="saveLocation" method="post">
    <label for="id">ID:</label>
    <input type="text" id="id" name="id" required>

    <label for="code">Code:</label>
    <input type="text" id="code" name="code" required>

    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>

    <div class="location-options">
      <label>Location Type:</label>
      <div>
        <input type="radio" id="urban" name="type" value="URBAN" required>
        <label for="urban">Urban</label>
      </div>
      <div>
        <input type="radio" id="rural" name="type" value="RURAL" required>
        <label for="rural">Rural</label>
      </div>
    </div>

    <button type="submit">Save</button>
  </form>
  <h2>${message}</h2>
  <a href="displayLocations">View All Locations</a>
</div>

</body>
</html>