/**
 * 实现代码文件
 * 
 * @author Kyle
 * @since 2016-3-4
 * @version V1.0
 */
package com.routesearch.route;
	
import java.util.*;

public final class Route {
	public static int graph[][] = new int[600][600];
	public static Map<String, Integer> pair2ID = new HashMap<String, Integer>();
	public static Set<Integer> demands = new HashSet<Integer>();
	public static int s;
	public static int t;
	
	public static void loadData(String graphContent, String condition) {
		String edges[] = graphContent.split("\n");
		for(String edge : edges) {
			String data[] = edge.split(",");
			pair2ID.put(data[1]+"#"+data[2], Integer.parseInt(data[0]));
			graph[Integer.parseInt(data[1])][Integer.parseInt(data[2])] = Integer.parseInt(data[3]);
		}
		String tmp[] = condition.split("\n")[0].split(",");
		s = Integer.parseInt(tmp[0]);
		t = Integer.parseInt(tmp[1]);
		String str_demands[] = tmp[2].split("\\|");
		for(String str : str_demands)
			demands.add(Integer.parseInt(str.trim()));
	}
	
	/**
     * 你需要完成功能的入口
     * 
     * @author Kyle
     * @since 2016-3-4
     * @version V1
     */
    public static String searchRoute(String graphContent, String condition) {
    	loadData(graphContent, condition);
    	
        return "";
    }

}