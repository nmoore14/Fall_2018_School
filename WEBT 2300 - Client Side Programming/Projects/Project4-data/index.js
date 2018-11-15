$(document).ready(function () {
	// http://apps.northeaststate.edu/webservices/faculty_staff_directory/index.php?callback=?&format=json
	// load the json file (linked in the comment above this line) and parse out the table then append to the id faculty_staff_directory
	// use the 1_jQuery_JSON.html example file from class to reference in completeing this assignment
});  

var app = new Vue({
	el: "#app",
	data: {
		staffDir: [],
		staffSelect: false,
		staffName: '',
		staffTitle: '',
		staffEct: '',
		staffLocation: '',
		staffEmail: '',
		staffPhone: ''
	},
	mounted() {
			this.getStaff()
		},
	methods: {
		getStaff() {
			var vm = this
			axios.get('./data.json')
				.then(function (res) {
					vm.staffDir = JSON.parse(JSON.stringify(res.data.staff))
					vm.renderPage = true
				})
				.catch(function (err) {
					console.log(err)
				})
		},
		selectStaff(id) {
			console.log(id);
			this.staffSelect = true;
			this.staffName = this.staffDir[id].name;
			this.staffTitle = this.staffDir[id].title;
			this.staffExt = this.staffDir[id].ext;
			this.staffLocation = this.staffDir[id].location;
			this.staffEmail = this.staffDir[id].email;
			this.staffPhone = this.staffDir[id].phone;

		}
	}
})