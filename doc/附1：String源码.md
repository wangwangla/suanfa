# String字符串

## 构造器

（1）如果new无参数的，那么就使用一个空串
（2）如果传入的是字符串，那么就使用原来的字符集和字符串。
总之就是将值给value，以及字符集。

```java
    public String() {
        this.value = "".value;
        this.coder = "".coder;
    }

    @HotSpotIntrinsicCandidate
    public String(String original) {
        this.value = original.value;
        this.coder = original.coder;
        this.hash = original.hash;
    }

    public String(char[] value) {
        this((char[])value, 0, value.length, (Void)null);
    }

    public String(char[] value, int offset, int count) {
        this(value, offset, count, rangeCheck(value, offset, count));
    }
String(char[] value, int off, int len, Void sig) {
        if (len == 0) {
            this.value = "".value;
            this.coder = "".coder;
        } else {
            if (COMPACT_STRINGS) {
                byte[] val = StringUTF16.compress(value, off, len);
                if (val != null) {
                    this.value = val;
                    this.coder = 0;
                    return;
                }
            }

            this.coder = 1;
            this.value = StringUTF16.toBytes(value, off, len);
        }
    }
```

