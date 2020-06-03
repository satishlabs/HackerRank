package com.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.net.*;


public class GetMovieTitles {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		final String filename = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
		String[] res;
		String _subStr;

		try {
			_subStr = sc.nextLine();
		}catch (Exception e) {
			_subStr = null;
		}

		res = getMovieTitles(_subStr);
		for(int res_i=0; res_i<res.length; res_i++) {
			bw.write(String.valueOf(res[res_i]));
			bw.newLine();
		}
		bw.close();
	}

	static String[] getMovieTitles(String substr) {
		String response;
		int startPage = 1;
		int totalPages = Integer.MAX_VALUE;
		List<String> titles = new ArrayList<>();
		while (startPage <= totalPages) {
			try {
				URL obj = new URL(
						"https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr + "&page=" + startPage);
				HttpURLConnection con = (HttpURLConnection) obj.openConnection();
				con.setRequestMethod("GET");
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				while ((response = in.readLine()) != null) {
					JsonObject convertedObject = new Gson().fromJson(response, JsonObject.class);
					totalPages = convertedObject.get("total_pages").getAsInt();
					JsonArray data = convertedObject.getAsJsonArray("data");
					for (int i = 0; i < data.size(); i++) {
						String title = data.get(i).getAsJsonObject().get("Title").getAsString();
						titles.add(title);
					}
				}
				in.close();
				startPage++;
			} catch (Exception ex) {
				ex.printStackTrace();
				return null;
			}

		}
		Collections.sort(titles);
		return titles.toArray(new String[0]);
	}
}
