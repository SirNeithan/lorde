import heapq

def dijkstra(graph, start):
  """Implements Dijkstra's algorithm to find the shortest path from a given start node to all other nodes in a graph.

  Args:
    graph: A dictionary representing the graph, where keys are nodes and values are dictionaries of neighboring nodes and their corresponding edge weights.
    start: The starting node for the shortest path calculation.

  Returns:
    A dictionary containing the shortest distances from the start node to all other nodes.
  """

  distances = {node: float('inf') for node in graph}
  distances[start] = 0
  priority_queue = [(0, start)]

  while priority_queue:
    current_distance, current_node = heapq.heappop(priority_queue)

    if current_distance > distances[current_node]:
      # Skip if a shorter path has already been found.
      continue

    for neighbor, weight in graph[current_node].items():
      alternative_distance = current_distance + weight
      if alternative_distance < distances[neighbor]:
        distances[neighbor] = alternative_distance
        heapq.heappush(priority_queue, (alternative_distance, neighbor))

  return distances
