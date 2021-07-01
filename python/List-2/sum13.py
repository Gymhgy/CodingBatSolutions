# List-2
# Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
# Problem Source: https://codingbat.com/prob/p167025
def sum13(nums):
  return sum((a!=13)*(b!=13)*b for a, b in zip([1]+nums, nums))