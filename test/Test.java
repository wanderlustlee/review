
import com.google.common.primitives.Bytes;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

class Test {
	private static class Node {
		int		data;
		Node	next;

		public Node(int data) {
			this.data = data;
		}

		public Node() {
		}
	}

	public static Node reverse(Node head) {
		if (head == null) {
			return head;
		}
		Stack<Node> stack = new Stack<Node>();
		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		Node newHead = stack.pop();
		Node temp = newHead;
		while (!stack.isEmpty()) {
			temp.next = stack.pop();
			temp = temp.next;
		}
		temp.next = null;
		return newHead;
	}

	public static Node multiply(Node head1, Node head2) {
		StringBuilder number1 = new StringBuilder();
		StringBuilder number2 = new StringBuilder();

		while (head1 != null) {
			number1.append(head1.data);
			head1 = head1.next;
		}
		while (head2 != null) {
			number2.append(head2.data);
			head2 = head2.next;
		}

		int length1 = number1.length();
		int length2 = number2.length();
		int[] array = new int[length1 + length2];

		for (int i = length1 - 1; i >= 0; i--) {
			for (int j = length2 - 1; j >= 0; j--) {
				int multiplyTemp = (number1.charAt(i) - '0') * (number2.charAt(j) - '0');
				int tenPlace = i + j, onePlace = i + j + 1;
				int sum = multiplyTemp + array[onePlace];
				array[tenPlace] += sum / 10;
				array[onePlace] = sum % 10;
			}
		}

		int i = 0;
		while (i < array.length && array[i] == 0) {
			i++;
		}
		Node resultHead = new Node();
		Node temp = resultHead;
		while (i < array.length) {
			temp.next = new Node(array[i]);
			temp = temp.next;
			i++;
		}
		return resultHead.next;
	}
}

class Base32Util {
    private static HashMap<String, Character> encodeMap = new HashMap<>();
    private static HashMap<Character, String> decodeMap = new HashMap<>();

    static {
        encodeMap.put("00000", 'a');
        encodeMap.put("00001", 'b');
        encodeMap.put("00010", 'c');
        encodeMap.put("00011", 'd');
        encodeMap.put("00100", 'e');
        encodeMap.put("00101", 'f');
        encodeMap.put("00110", 'g');
        encodeMap.put("00111", 'h');
        encodeMap.put("01000", 'i');
        encodeMap.put("01001", 'j');
        encodeMap.put("01010", 'k');
        encodeMap.put("01011", 'l');
        encodeMap.put("01100", 'm');
        encodeMap.put("01101", 'n');
        encodeMap.put("01110", 'o');
        encodeMap.put("01111", 'p');
        encodeMap.put("10000", 'q');
        encodeMap.put("10001", 'r');
        encodeMap.put("10010", 's');
        encodeMap.put("10011", 't');
        encodeMap.put("10100", 'u');
        encodeMap.put("10101", 'v');
        encodeMap.put("10110", 'w');
        encodeMap.put("10111", 'x');
        encodeMap.put("11000", 'y');
        encodeMap.put("11001", 'z');
        encodeMap.put("11010", '0');
        encodeMap.put("11011", '1');
        encodeMap.put("11100", '2');
        encodeMap.put("11101", '3');
        encodeMap.put("11110", '4');
        encodeMap.put("11111", '5');
    }
    
    static {
        decodeMap.put('a', "00000");
        decodeMap.put('b', "00001");
        decodeMap.put('c',"00010");
        decodeMap.put('d', "00011");
        decodeMap.put('e', "00100");
        decodeMap.put('f', "00101");
        decodeMap.put('g', "00110");
        decodeMap.put('h', "00111");
        decodeMap.put('i', "01000");
        decodeMap.put('j', "01001");
        decodeMap.put('k', "01010");
        decodeMap.put('l', "01011");
        decodeMap.put('m', "01100");
        decodeMap.put('n', "01101");
        decodeMap.put('o', "01110");
        decodeMap.put('p', "01111");
        decodeMap.put('q', "10000");
        decodeMap.put('r', "10001");
        decodeMap.put('s', "10010");
        decodeMap.put('t', "10011");
        decodeMap.put('u', "10100");
        decodeMap.put('v', "10101");
        decodeMap.put('w', "10110");
        decodeMap.put('x', "10111");
        decodeMap.put('y', "11000");
        decodeMap.put('z', "11001");
        decodeMap.put('0', "11010");
        decodeMap.put('1', "11011");
        decodeMap.put('2', "11100");
        decodeMap.put('3', "11101");
        decodeMap.put('4', "11110");
        decodeMap.put('5', "11111");
    }
	public static String encode(byte[] data) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < data.length; i = i + 5) {
			StringBuilder stringBuilder = new StringBuilder();
			for (int j = i; j < i + 5; j++) {
				if (j < data.length) {
					stringBuilder.append(data[j]);
				} else {
					stringBuilder.append('0');
				}
			}
			list.add(stringBuilder.toString());
		}

		StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(encodeMap.get(list.get(i)));
        }
		return result.toString();
	}

	public static byte[] decode(String data) throws Exception {
		List<Byte> result = new ArrayList<>();
        for (int i = 0; i < data.length(); i++) {
            String decodeChar = decodeMap.get(data.charAt(i));
            if (StringUtils.isBlank(decodeChar)) {
                throw new Exception("输入不合法！");
            }
            for (int j = 0; j < decodeChar.length(); j++) {
                result.add(Byte.valueOf(String.valueOf(decodeChar.charAt(j))));
            }
        }
        return Bytes.toArray(result);
	}

}