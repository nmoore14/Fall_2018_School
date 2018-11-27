import json

my_dictionary = []
temp_dict = []

with open('data.json') as json_file:
	data = json.load(json_file)
	for p in data['staff']:
		for i in range (0, 493):
			# print(p)
			temp_dict[i] = p
			my_dictionary.append(temp_dict)
		# temp_dict['name'] = p['name']
		# temp_dict['title'] = p['title']
		# temp_dict['ext'] = p['ext']
		# temp_dict['location'] = p['location']
		# temp_dict['email'] = p['email']
		# temp_dict['phone'] = p['phone']
		# temp_dict['show'] = 'true'

# with open('new-staff.json', 'w') as outfile:
#     json.dump(my_dictionary, outfile)

print(json.dumps(my_dictionary, indent=2))

# print temp_dict[0]


