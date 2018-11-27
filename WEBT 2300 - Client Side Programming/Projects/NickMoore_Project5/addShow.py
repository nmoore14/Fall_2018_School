import json

my_dictionary = {}

with open('staff-index.json') as json_file:
    data = json.load(json_file)
    for p in data['staff']:
			# print('id: ' + p['id'])
			my_dictionary['id'] = p['id']
			# print('name: ' + p['name'])
			my_dictionary['name'] = p['name']
			# print('title: ' + p['title'])
			my_dictionary['title'] = p['title']
			# print('ext: ' + p['ext'])
			my_dictionary['ext'] = p['ext']
			# print('location: ' + p['location'])
			my_dictionary['location'] = p['location']
			# print('email: ' + p['email'])
			my_dictionary['email'] = p['email']
			# print('phone: ' + p['phone'])
			my_dictionary['phone'] = p['phone']
			# print('')
			my_dictionary['show'] = 'true'

print(json.dumps(my_dictionary))
