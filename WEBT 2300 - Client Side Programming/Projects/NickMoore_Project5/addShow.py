import json

my_dictionary = []
temp_dict = []

with open('staff-index.json') as json_file:
	data = json.load(json_file)
	for p in data['staff']:
		print(p)
		# temp_dict['id'] = p['id']
		# temp_dict['name'] = p['name']
		# temp_dict['title'] = p['title']
		# temp_dict['ext'] = p['ext']
		# temp_dict['location'] = p['location']
		# temp_dict['email'] = p['email']
		# temp_dict['phone'] = p['phone']
		# temp_dict['show'] = 'true'
		temp_dict.append(p)

# with open('new-staff.json', 'w') as outfile:
#     json.dump(my_dictionary, outfile)

# print(json.dumps(temp_dict, indent=2))

print temp_dict[0]


