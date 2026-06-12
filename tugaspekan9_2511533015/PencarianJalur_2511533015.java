package tugaspekan9_2511533015;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.*;
	import java.util.List;

	// Kelas utama dengan akhiran NIM 2511533015
	public class PencarianJalur_2511533015 extends JFrame {
	    // Variabel dengan akhiran _3015
	    private Graph_2511533015 graph_3015;
	    private JComboBox<String> startCombo_3015;
	    private JComboBox<String> goalCombo_3015;
	    private JTextArea resultArea_3015;
	    private DrawingPanel_2511533015 drawingPanel_3015;
	    private Set<String> visitedNodesSet_3015;
	    private Set<String> pathNodesSet_3015;
	    private List<String> lastVisitedOrder_3015;
	    private int lastExploredCount_3015;

	    public PencarianJalur_2511533015() {
	        // Inisialisasi graph
	        graph_3015 = new Graph_2511533015();
	        visitedNodesSet_3015 = new HashSet<>();
	        pathNodesSet_3015 = new HashSet<>();
	        lastVisitedOrder_3015 = new ArrayList<>();
	        lastExploredCount_3015 = 0;

	        setTitle("Pencarian Jalur BFS dan DFS - NIM 2511533015");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(1000, 700);
	        setLayout(new BorderLayout());

	        // Panel atas untuk kontrol
	        JPanel controlPanel_3015 = new JPanel(new FlowLayout());
	        controlPanel_3015.add(new JLabel("Lokasi Awal:"));
	        startCombo_3015 = new JComboBox<>(graph_3015.getNodes_3015().toArray(new String[0]));
	        controlPanel_3015.add(startCombo_3015);
	        controlPanel_3015.add(new JLabel("Lokasi Tujuan:"));
	        goalCombo_3015 = new JComboBox<>(graph_3015.getNodes_3015().toArray(new String[0]));
	        controlPanel_3015.add(goalCombo_3015);

	        JButton bfsButton_3015 = new JButton("BFS");
	        JButton dfsButton_3015 = new JButton("DFS");
	        JButton resetButton_3015 = new JButton("RESET");

	        // Memberi warna pada tombol sesuai permintaan
	        bfsButton_3015.setBackground(Color.GREEN);
	        bfsButton_3015.setOpaque(true);
	        dfsButton_3015.setBackground(Color.ORANGE);
	        dfsButton_3015.setOpaque(true);
	        resetButton_3015.setBackground(Color.RED);
	        resetButton_3015.setOpaque(true);
	        // Opsional: ubah warna teks agar kontras
	        bfsButton_3015.setForeground(Color.BLACK);
	        dfsButton_3015.setForeground(Color.BLACK);
	        resetButton_3015.setForeground(Color.WHITE);

	        controlPanel_3015.add(bfsButton_3015);
	        controlPanel_3015.add(dfsButton_3015);
	        controlPanel_3015.add(resetButton_3015);
	        add(controlPanel_3015, BorderLayout.NORTH);

	        // Area gambar graph
	        drawingPanel_3015 = new DrawingPanel_2511533015();
	        drawingPanel_3015.setBackground(Color.WHITE);
	        add(drawingPanel_3015, BorderLayout.CENTER);

	        // Area hasil pencarian
	        resultArea_3015 = new JTextArea(10, 40);
	        resultArea_3015.setEditable(false);
	        JScrollPane scrollPane_3015 = new JScrollPane(resultArea_3015);
	        add(scrollPane_3015, BorderLayout.SOUTH);

	        // Action listeners
	        bfsButton_3015.addActionListener(new ActionListener_3015() {
	            @Override
	            public void actionPerformed_3015(ActionEvent e) {
	                performBFS_3015();
	            }
	        });

	        dfsButton_3015.addActionListener(new ActionListener_3015() {
	            @Override
	            public void actionPerformed_3015(ActionEvent e) {
	                performDFS_3015();
	            }
	        });

	        resetButton_3015.addActionListener(new ActionListener_3015() {
	            @Override
	            public void actionPerformed_3015(ActionEvent e) {
	                resetGraph_3015();
	            }
	        });

	        // Tampilkan graph awal
	        displayGraph_3015();
	    }

	    // Method BFS sesuai ketentuan
	    private void performBFS_3015() {
	        String start = (String) startCombo_3015.getSelectedItem();
	        String goal = (String) goalCombo_3015.getSelectedItem();
	        if (start == null || goal == null) return;

	        resetGraph_3015();

	        SearchResult_3015 result = bfsSearch_3015(start, goal);
	        if (result.path_3015.isEmpty()) {
	            resultArea_3015.setText("Tidak ditemukan jalur dari " + start + " ke " + goal);
	        } else {
	            displayPath_3015(result.path_3015);
	            visitedNodesSet_3015.addAll(result.visitedOrder_3015);
	            pathNodesSet_3015.addAll(result.path_3015);
	            lastVisitedOrder_3015 = result.visitedOrder_3015;
	            lastExploredCount_3015 = result.exploredCount_3015;

	            resultArea_3015.append("\n\nJalur ditemukan menggunakan BFS\n");
	            resultArea_3015.append("Jumlah node dieksplorasi: " + lastExploredCount_3015 + "\n");
	            resultArea_3015.append("Urutan node dikunjungi: " + String.join(" -> ", lastVisitedOrder_3015) + "\n");
	        }
	        drawingPanel_3015.repaint();
	    }

	    // Method DFS sesuai ketentuan
	    private void performDFS_3015() {
	        String start = (String) startCombo_3015.getSelectedItem();
	        String goal = (String) goalCombo_3015.getSelectedItem();
	        if (start == null || goal == null) return;

	        resetGraph_3015();

	        SearchResult_3015 result = dfsSearch_3015(start, goal);
	        if (result.path_3015.isEmpty()) {
	            resultArea_3015.setText("Tidak ditemukan jalur dari " + start + " ke " + goal);
	        } else {
	            displayPath_3015(result.path_3015);
	            visitedNodesSet_3015.addAll(result.visitedOrder_3015);
	            pathNodesSet_3015.addAll(result.path_3015);
	            lastVisitedOrder_3015 = result.visitedOrder_3015;
	            lastExploredCount_3015 = result.exploredCount_3015;

	            resultArea_3015.append("\n\nJalur ditemukan menggunakan DFS\n");
	            resultArea_3015.append("Jumlah node dieksplorasi: " + lastExploredCount_3015 + "\n");
	            resultArea_3015.append("Urutan node dikunjungi: " + String.join(" -> ", lastVisitedOrder_3015) + "\n");
	        }
	        drawingPanel_3015.repaint();
	    }

	    // Implementasi BFS
	    private SearchResult_3015 bfsSearch_3015(String start, String goal) {
	        Queue<String> queue_3015 = new LinkedList<>();
	        Map<String, String> parent_3015 = new HashMap<>();
	        Set<String> visited_3015 = new HashSet<>();
	        List<String> order_3015 = new ArrayList<>();
	        int explored_3015 = 0;

	        queue_3015.add(start);
	        visited_3015.add(start);
	        parent_3015.put(start, null);
	        order_3015.add(start);

	        while (!queue_3015.isEmpty()) {
	            String current_3015 = queue_3015.poll();
	            explored_3015++;

	            if (current_3015.equals(goal)) {
	                List<String> path_3015 = reconstructPath_3015(parent_3015, start, goal);
	                return new SearchResult_3015(path_3015, order_3015, explored_3015);
	            }

	            for (String neighbor_3015 : graph_3015.getNeighbors_3015(current_3015)) {
	                if (!visited_3015.contains(neighbor_3015)) {
	                    visited_3015.add(neighbor_3015);
	                    parent_3015.put(neighbor_3015, current_3015);
	                    queue_3015.add(neighbor_3015);
	                    order_3015.add(neighbor_3015);
	                }
	            }
	        }
	        return new SearchResult_3015(new ArrayList<>(), order_3015, explored_3015);
	    }

	    // Implementasi DFS (iteratif dengan stack)
	    private SearchResult_3015 dfsSearch_3015(String start, String goal) {
	        Stack<String> stack_3015 = new Stack<>();
	        Map<String, String> parent_3015 = new HashMap<>();
	        Set<String> visited_3015 = new HashSet<>();
	        List<String> order_3015 = new ArrayList<>();
	        int explored_3015 = 0;

	        stack_3015.push(start);
	        visited_3015.add(start);
	        parent_3015.put(start, null);
	        order_3015.add(start);

	        while (!stack_3015.isEmpty()) {
	            String current_3015 = stack_3015.pop();
	            explored_3015++;

	            if (current_3015.equals(goal)) {
	                List<String> path_3015 = reconstructPath_3015(parent_3015, start, goal);
	                return new SearchResult_3015(path_3015, order_3015, explored_3015);
	            }

	            for (String neighbor_3015 : graph_3015.getNeighbors_3015(current_3015)) {
	                if (!visited_3015.contains(neighbor_3015)) {
	                    visited_3015.add(neighbor_3015);
	                    parent_3015.put(neighbor_3015, current_3015);
	                    stack_3015.push(neighbor_3015);
	                    order_3015.add(neighbor_3015);
	                }
	            }
	        }
	        return new SearchResult_3015(new ArrayList<>(), order_3015, explored_3015);
	    }

	    // Membangun jalur dari parent map
	    private List<String> reconstructPath_3015(Map<String, String> parent_3015, String start, String goal) {
	        List<String> path_3015 = new LinkedList<>();
	        String current_3015 = goal;
	        while (current_3015 != null) {
	            path_3015.add(0, current_3015);
	            current_3015 = parent_3015.get(current_3015);
	        }
	        if (path_3015.get(0).equals(start)) {
	            return path_3015;
	        }
	        return new ArrayList<>();
	    }

	    // Menampilkan jalur di area hasil
	    public void displayPath_3015(List<String> path_3015) {
	        if (path_3015.isEmpty()) {
	            resultArea_3015.setText("Jalur: Tidak ada jalur\n");
	        } else {
	            resultArea_3015.setText("Jalur: " + String.join(" -> ", path_3015) + "\n");
	            resultArea_3015.append("Node Dikunjungi: " + String.join(", ", lastVisitedOrder_3015) + "\n");
	            resultArea_3015.append("Jumlah Node Dikunjungi: " + lastVisitedOrder_3015.size() + "\n");
	        }
	    }

	    // Menampilkan graph (cetak adjacency list ke console)
	    public void displayGraph_3015() {
	        System.out.println("===== Representasi Graph (Adjacency List) =====");
	        for (String node_3015 : graph_3015.getNodes_3015()) {
	            System.out.print(node_3015 + " -> ");
	            List<String> neighbors_3015 = graph_3015.getNeighbors_3015(node_3015);
	            System.out.println(String.join(", ", neighbors_3015));
	        }
	        System.out.println("==============================================");
	    }

	    // Reset graph ke keadaan awal
	    public void resetGraph_3015() {
	        visitedNodesSet_3015.clear();
	        pathNodesSet_3015.clear();
	        lastVisitedOrder_3015.clear();
	        lastExploredCount_3015 = 0;
	        resultArea_3015.setText("");
	        drawingPanel_3015.repaint();
	    }

	    // Kelas untuk menyimpan hasil pencarian
	    private class SearchResult_3015 {
	        List<String> path_3015;
	        List<String> visitedOrder_3015;
	        int exploredCount_3015;

	        SearchResult_3015(List<String> path_3015, List<String> visitedOrder_3015, int exploredCount_3015) {
	            this.path_3015 = path_3015;
	            this.visitedOrder_3015 = visitedOrder_3015;
	            this.exploredCount_3015 = exploredCount_3015;
	        }
	    }

	    // Interface ActionListener dengan akhiran 3015
	    private interface ActionListener_3015 extends ActionListener {
	        void actionPerformed_3015(ActionEvent e);
	        default void actionPerformed(ActionEvent e) { actionPerformed_3015(e); }
	    }

	    // Panel untuk menggambar graph
	    private class DrawingPanel_2511533015 extends JPanel {
	        @Override
	        protected void paintComponent(Graphics g_3015) {
	            super.paintComponent(g_3015);
	            Graphics2D g2d_3015 = (Graphics2D) g_3015;
	            g2d_3015.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	            // Gambar edges
	            g2d_3015.setColor(Color.BLACK);
	            for (String[] edge_3015 : graph_3015.getEdges_3015()) {
	                Point p1_3015 = graph_3015.getNodePosition_3015(edge_3015[0]);
	                Point p2_3015 = graph_3015.getNodePosition_3015(edge_3015[1]);
	                if (p1_3015 != null && p2_3015 != null) {
	                    g2d_3015.drawLine(p1_3015.x, p1_3015.y, p2_3015.x, p2_3015.y);
	                }
	            }

	            // Gambar node
	            for (String node_3015 : graph_3015.getNodes_3015()) {
	                Point pos_3015 = graph_3015.getNodePosition_3015(node_3015);
	                if (pos_3015 == null) continue;

	                // Warna node berdasarkan status
	                if (pathNodesSet_3015.contains(node_3015)) {
	                    g2d_3015.setColor(Color.GREEN);
	                } else if (visitedNodesSet_3015.contains(node_3015)) {
	                    g2d_3015.setColor(Color.CYAN);
	                } else {
	                    g2d_3015.setColor(Color.LIGHT_GRAY);
	                }
	                g2d_3015.fillOval(pos_3015.x - 20, pos_3015.y - 20, 40, 40);
	                g2d_3015.setColor(Color.BLACK);
	                g2d_3015.drawOval(pos_3015.x - 20, pos_3015.y - 20, 40, 40);
	                FontMetrics fm_3015 = g2d_3015.getFontMetrics();
	                int textWidth_3015 = fm_3015.stringWidth(node_3015);
	                g2d_3015.drawString(node_3015, pos_3015.x - textWidth_3015/2, pos_3015.y + 5);
	            }
	        }
	    }

	    // Kelas graph dengan akhiran NIM 2511533015
	    private static class Graph_2511533015 {
	        private Map<String, List<String>> adjList_3015;
	        private List<String> nodes_3015;
	        private List<String[]> edges_3015;
	        private Map<String, Point> positions_3015;

	        public Graph_2511533015() {
	            adjList_3015 = new HashMap<>();
	            nodes_3015 = new ArrayList<>();
	            edges_3015 = new ArrayList<>();
	            positions_3015 = new HashMap<>();
	            initGraph_3015();
	        }

	        private void initGraph_3015() {
	            // Daftar node (minimal 10 node)
	            String[] nodeNames_3015 = {
	                "Rektorat", "FTI", "Perpus", "Masjid", "PKM",
	                "Lab Jaringan", "Labor AI", "Gedung Serbaguna",
	                "Koperasi", "Kantin Pusat", "Dosen", "Auditorium"
	            };
	            for (String node_3015 : nodeNames_3015) {
	                nodes_3015.add(node_3015);
	                adjList_3015.put(node_3015, new ArrayList<>());
	            }

	            // Posisi node (x,y) dalam panel
	            positions_3015.put("Rektorat", new Point(200, 100));
	            positions_3015.put("FTI", new Point(350, 100));
	            positions_3015.put("Perpus", new Point(500, 150));
	            positions_3015.put("Masjid", new Point(650, 100));
	            positions_3015.put("PKM", new Point(300, 250));
	            positions_3015.put("Lab Jaringan", new Point(450, 250));
	            positions_3015.put("Labor AI", new Point(600, 250));
	            positions_3015.put("Gedung Serbaguna", new Point(500, 380));
	            positions_3015.put("Koperasi", new Point(200, 380));
	            positions_3015.put("Kantin Pusat", new Point(350, 400));
	            positions_3015.put("Dosen", new Point(700, 380));
	            positions_3015.put("Auditorium", new Point(800, 250));

	            // Daftar edge (minimal 15 edge)
	            String[][] edgeList_3015 = {
	                {"Rektorat", "FTI"}, {"Rektorat", "PKM"}, {"Rektorat", "Perpus"},
	                {"FTI", "Perpus"}, {"FTI", "Lab Jaringan"}, {"FTI", "Labor AI"},
	                {"Perpus", "Masjid"}, {"PKM", "Gedung Serbaguna"}, {"PKM", "Kantin Pusat"},
	                {"PKM", "Koperasi"}, {"Masjid", "Gedung Serbaguna"},
	                {"Lab Jaringan", "Labor AI"}, {"Labor AI", "Auditorium"},
	                {"Auditorium", "Dosen"}, {"Dosen", "Gedung Serbaguna"},
	                {"Koperasi", "Kantin Pusat"}
	            };

	            for (String[] edge_3015 : edgeList_3015) {
	                addEdge_3015(edge_3015[0], edge_3015[1]);
	                edges_3015.add(new String[]{edge_3015[0], edge_3015[1]});
	            }
	        }

	        private void addEdge_3015(String u, String v) {
	            adjList_3015.get(u).add(v);
	            adjList_3015.get(v).add(u);
	        }

	        public List<String> getNodes_3015() { return nodes_3015; }
	        public List<String> getNeighbors_3015(String node) { return adjList_3015.get(node); }
	        public List<String[]> getEdges_3015() { return edges_3015; }
	        public Point getNodePosition_3015(String node) { return positions_3015.get(node); }
	    }

	    public static void main(String[] args_3015) {
	        SwingUtilities.invokeLater(() -> {
	            PencarianJalur_2511533015 frame_3015 = new PencarianJalur_2511533015();
	            frame_3015.setVisible(true);
	        });
	    }
	}
