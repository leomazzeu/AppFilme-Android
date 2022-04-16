# APP Filmes - Android

Aplicativo com tema de filmes desenvolvido para disciplina de Aplicações Móveis.

## Objetivo
Implementar um aplicativo utilizando RecyclerView que deve conter:
- Activity com recyclerView;
- Layout de 1 item;
- Model que irá ser exibido no layout;
- Lista de objetos deste model;
- Adapter da Lista com seu ViewHolder

### Resultado:
![Screen_Recording_20220416-141230_ListaFilmesRecyclerView](https://user-images.githubusercontent.com/63673408/163685146-229234e1-d475-4e3f-b7f2-ae688612bff2.gif)

#### Implementação

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_film, parent, false);
            MyViewHolder holder = new MyViewHolder(view);
            return holder;
        }
    
        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.tv_filmName.setText(filmList.get(position).getName());
            holder.tv_filmLaunchDate.setText(String.valueOf(filmList.get(position).getDateOfLaunch()));
            Glide.with(this.context).load(filmList.get(position).getImageURL()).into(holder.iv_filmPic);
        }
    
        @Override
        public int getItemCount() {
            return filmList.size();
        }

OBS: A funcionalidade de Adicionar um novo filme ainda não foi totalmente implementada. Por enquanto os filmes estão salvos em ArrayList.

### Autores:
* **[Leonardo Mazzeu](https://github.com/leomazzeu "Leonardo Mazzeu") e Guilherme Caselani**
