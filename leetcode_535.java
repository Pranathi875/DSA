public class Codec {
    HashMap<String,String>hm=new HashMap<>();
    int count=0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
       String shortUrl="https://tinyurl.com"+count;
       hm.put(shortUrl,longUrl);
       count++;
       return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hm.get(shortUrl);
    }
}
