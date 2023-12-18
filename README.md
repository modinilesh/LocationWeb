# LocationWeb

Welcome to LocationWeb, a web app designed to simplify location management. This application meets your requirements, offering an intuitive interface for adding, viewing, editing, and deleting locations. Additionally, it provides features such as email confirmations and live pie charts.

## Getting Started

Follow these steps to get started:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/LocationWeb.git
   ```

2. **Navigate to the project directory:**
   ```bash
   cd LocationWeb
   ```

3. **Install dependencies:**
   ```bash
   npm install
   ```

4. **Run the application:**
   ```bash
   npm start
   ```

## User Requirements

### 1. Add New Location
- **Endpoint:** `/locationweb/showCreate`
- **Method:** GET
   - Navigate to this endpoint to add a new location.

### 2. Email Confirmation on Location Save
- **Endpoint:** `/locationweb/saveLocation`
- **Method:** POST
   - Save a location, and a confirmation will be sent to your email.

### 3. View All Locations
- **Endpoint:** `/locationweb/displayLocations`
- **Method:** GET
   - Access this endpoint to see all locations in the database.

### 4. Edit and Delete Location
- **Controllers:**
   1. `LocationWebController`
   2. `LocationRestController`
   - Use these controllers to edit and delete locations as needed.

### 5. Live Pie Chart
- **Endpoint:** `/locationweb/report`
- **Method:** GET
   - Experience live pie charts based on the type of locations.

## Folder Structure

```
LocationWeb/
|-- src/
|   |-- main/
|       |-- java/
|           |-- com/
|               |-- springboot/
|                   |-- udemy/
|                       |-- LocationWeb/
|                           |-- controllers/
|                               |-- LocationWebController.java
|                               |-- LocationRestController.java
|           |-- resources/
|               |-- templates/
|                   |-- (view pages)
|               |-- (other resources)
|-- (other project files)
```

Feel free to explore the code and customize the application according to your needs. If you encounter any issues or have questions, please refer to the documentation or reach out to our support team. Happy coding!
