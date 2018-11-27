import json

my_dictionary = []
temp_dict = {}

with open('staff-index.json') as json_file:
    data = json.load(json_file)
    for p in data['staff']:
			print(p)
			# print('id: ' + p['id'])
			temp_dict['id'] = p['id']
			# print('name: ' + p['name'])
			temp_dict['name'] = p['name']
			# print('title: ' + p['title'])
			temp_dict['title'] = p['title']
			# print('ext: ' + p['ext'])
			temp_dict['ext'] = p['ext']
			# print('location: ' + p['location'])
			temp_dict['location'] = p['location']
			# print('email: ' + p['email'])
			temp_dict['email'] = p['email']
			# print('phone: ' + p['phone'])
			temp_dict['phone'] = p['phone']
			# print('')
			temp_dict['show'] = 'true'
			my_dictionary.append(temp_dict)

with open('new-staff.json', 'w') as outfile:
    json.dump(my_dictionary, outfile)

print(json.dumps(my_dictionary, indent=2))

