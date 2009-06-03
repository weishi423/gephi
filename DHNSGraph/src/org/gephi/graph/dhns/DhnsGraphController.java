/*
Copyright 2008 WebAtlas
Authors : Mathieu Bastian, Mathieu Jacomy, Julian Bilcke
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.graph.dhns;

import org.gephi.graph.api.ClusteredDirectedGraph;
import org.gephi.graph.api.ClusteredMixedGraph;
import org.gephi.graph.api.ClusteredUndirectedGraph;
import org.gephi.graph.api.DirectedGraph;
import org.gephi.graph.api.GraphController;
import org.gephi.graph.api.GraphFactory;
import org.gephi.graph.api.MixedGraph;
import org.gephi.graph.api.UndirectedGraph;
import org.gephi.graph.dhns.core.Dhns;
import org.gephi.graph.dhns.graph.ClusteredDirectedGraphImpl;
import org.gephi.graph.dhns.graph.ClusteredMixedGraphImpl;
import org.gephi.graph.dhns.graph.ClusteredUndirectedGraphImpl;

/**
 * Singleton which manages the graph access.
 *
 * @author Mathieu Bastian
 */
public class DhnsGraphController implements GraphController {

    protected Dhns dhns;

    public DhnsGraphController() {
        dhns = new Dhns();
    }

    public GraphFactory factory() {
        return dhns.getGraphFactory();
    }

    public DirectedGraph getDirectedGraph() {
        return new ClusteredDirectedGraphImpl(dhns, false);
    }

    public DirectedGraph getVisibleDirectedGraph() {
        return new ClusteredDirectedGraphImpl(dhns, true);
    }

    public UndirectedGraph getUndirectedGraph() {
        return new ClusteredUndirectedGraphImpl(dhns, false);
    }

    public UndirectedGraph getVisibleUndirectedGraph() {
        return new ClusteredUndirectedGraphImpl(dhns, true);
    }

    public MixedGraph getMixedGraph() {
        return new ClusteredMixedGraphImpl(dhns, false);
    }

    public MixedGraph getVisibleMixedGraph() {
        return new ClusteredMixedGraphImpl(dhns, true);
    }

    public ClusteredDirectedGraph getClusteredDirectedGraph() {
        return new ClusteredDirectedGraphImpl(dhns, false);
    }

    public ClusteredDirectedGraph getVisibleClusteredDirectedGraph() {
        return new ClusteredDirectedGraphImpl(dhns, true);
    }

    public ClusteredUndirectedGraph getClusteredUndirectedGraph() {
        return new ClusteredUndirectedGraphImpl(dhns, false);
    }

    public ClusteredUndirectedGraph getVisibleClusteredUndirectedGraph() {
        return new ClusteredUndirectedGraphImpl(dhns, true);
    }

    public ClusteredMixedGraph getClusteredMixedGraph() {
        return new ClusteredMixedGraphImpl(dhns, false);
    }

    public ClusteredMixedGraph getVisibleClusteredMixedGraph() {
        return new ClusteredMixedGraphImpl(dhns, true);
    }
}
