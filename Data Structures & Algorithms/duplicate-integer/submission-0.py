class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        lst=list(set(nums))
        if len(nums)==len(lst):
            return False
        else:
            return True
        