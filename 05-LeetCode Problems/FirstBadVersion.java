package LeetCode;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (left == right && isBadVersion(left)) {
            return left;
        }
        return -1;
    }

    public boolean isBadVersion(int version) {
        if (version == 5) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
    FirstBadVersion firstBadVersion = new FirstBadVersion();
    System.out.println(firstBadVersion.firstBadVersion(5));
    }
}
