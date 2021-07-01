# List-2
# Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
# Problem Source: https://codingbat.com/prob/p108886
def sum67(nums):
  a,b=0,1
  for x in nums:
    b*=x!=6
    a+=b*x
    b=1 if x==7 else b
  return a