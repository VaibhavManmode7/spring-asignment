package Frontend;

public class index {
	<!-- index.html -->
	<!DOCTYPE html>
	<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Customer CRUD App</title>
	</head>
	<body>
	    <h1>Customer Management</h1>
	    <button onclick="loadCreateForm()">Create Customer</button>
	    <button onclick="syncCustomers()">Sync Customers</button>
	    <div id="customerList"></div>
	    <div id="customerForm"></div>

	    <script src="app.js"></script>
	</body>
	</html>


}
