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
			this.$http.get('http://apps.northeaststate.edu/webservices/faculty_staff_directory/index.php?callback=?&format=json')
				.then(res => {
					this.staffDir = res.data;
				});
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