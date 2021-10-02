my_list = ['geeks', 'for', 'geeks', 'like',
		'geeky','nerdy', 'geek', 'love',
			'questions','words', 'life']


def divide_chunks(l, n):
	

	for i in range(0, len(l), n):
		yield l[i:i + n]


n = 5

x = list(divide_chunks(my_list, n))
print (x)
