// $(document).ready(function () {
// 	function hideColumn(column) {
// 		$('th:nth-child(' + column + ')').hide();
// 		$('td:nth-child(' + column + ')').hide();
// 	}
// });

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
		staffPhone: '',
		hiddenCols: [],
		hiddenRows: []
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
		},
		hide(index) {
			this.staffDir[index].show = !this.staffDir[index].show;
			this.hiddenRows.push(index);
		},
		hideColumn(id) {
			$('th:nth-child(' + id + ')').hide();
			$('td:nth-child(' + id + ')').hide();
			this.hiddenCols.push(id);
			console.log(this.hidden);
		},
		showColumns() {
			for(i = 0; i < this.hiddenCols.length; i++) {
				$('th:nth-child(' + this.hiddenCols[i] + ')').show();
				$("td:nth-child(" + this.hiddenCols[i] + ")").show();
			}
			this.hiddenCols = [];
		},
		showAllRows() {
			for (i = 0; i < this.hiddenRows.length; i++) {
				this.staffDir[this.hiddenRows[i]].show = true;
			}
			this.hiddenRows = [];
		}
	}
})