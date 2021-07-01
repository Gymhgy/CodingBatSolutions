# List-2
# Given an array of ints, return True if the array contains a 2 next to a 2 somewhere.
# Problem Source: https://codingbat.com/prob/p119308
def has22(nums):
  return sum([a==2==b for a,b in zip(nums,nums[1:])])&gt;0
