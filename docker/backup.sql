PGDMP                     
    z         	   easyscrum    13.9 (Debian 13.9-1.pgdg110+1) #   14.5 (Ubuntu 14.5-0ubuntu0.22.04.1) ?    l           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            m           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            n           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            o           1262    16384 	   easyscrum    DATABASE     ]   CREATE DATABASE easyscrum WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'en_US.utf8';
    DROP DATABASE easyscrum;
                admin    false            ?            1259    16387    activity    TABLE     M  CREATE TABLE public.activity (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    project_id bigint NOT NULL,
    developer_id bigint NOT NULL,
    user_storie_id bigint NOT NULL
);
    DROP TABLE public.activity;
       public         heap    admin    false            ?            1259    16385    activity_id_seq    SEQUENCE     x   CREATE SEQUENCE public.activity_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.activity_id_seq;
       public          admin    false    201            p           0    0    activity_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.activity_id_seq OWNED BY public.activity.id;
          public          admin    false    200            ?            1259    16395    company    TABLE     (  CREATE TABLE public.company (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    cnpj character varying(255),
    name character varying(255)
);
    DROP TABLE public.company;
       public         heap    admin    false            ?            1259    16393    company_id_seq    SEQUENCE     w   CREATE SEQUENCE public.company_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.company_id_seq;
       public          admin    false    203            q           0    0    company_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.company_id_seq OWNED BY public.company.id;
          public          admin    false    202            ?            1259    16406    dev_team    TABLE     +  CREATE TABLE public.dev_team (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    surname character varying(255),
    project_id bigint NOT NULL
);
    DROP TABLE public.dev_team;
       public         heap    admin    false            ?            1259    16404    dev_team_id_seq    SEQUENCE     x   CREATE SEQUENCE public.dev_team_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.dev_team_id_seq;
       public          admin    false    205            r           0    0    dev_team_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.dev_team_id_seq OWNED BY public.dev_team.id;
          public          admin    false    204            ?            1259    16412    dev_team_participant    TABLE     r   CREATE TABLE public.dev_team_participant (
    participant_id bigint NOT NULL,
    dev_team_id bigint NOT NULL
);
 (   DROP TABLE public.dev_team_participant;
       public         heap    admin    false            ?            1259    16419 	   developer    TABLE       CREATE TABLE public.developer (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    person_id bigint NOT NULL
);
    DROP TABLE public.developer;
       public         heap    admin    false            ?            1259    16417    developer_id_seq    SEQUENCE     y   CREATE SEQUENCE public.developer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.developer_id_seq;
       public          admin    false    208            s           0    0    developer_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.developer_id_seq OWNED BY public.developer.id;
          public          admin    false    207            ?            1259    16427    guest    TABLE     N  CREATE TABLE public.guest (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    category integer,
    meeting_id bigint NOT NULL,
    person_id bigint NOT NULL,
    guest_id bigint
);
    DROP TABLE public.guest;
       public         heap    admin    false            ?            1259    16425    guest_id_seq    SEQUENCE     u   CREATE SEQUENCE public.guest_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.guest_id_seq;
       public          admin    false    210            t           0    0    guest_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.guest_id_seq OWNED BY public.guest.id;
          public          admin    false    209            ?            1259    16435    meeting    TABLE     ?  CREATE TABLE public.meeting (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    category integer,
    datetime timestamp without time zone,
    description character varying(255),
    link character varying(255),
    project_id bigint NOT NULL
);
    DROP TABLE public.meeting;
       public         heap    admin    false            ?            1259    16433    meeting_id_seq    SEQUENCE     w   CREATE SEQUENCE public.meeting_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.meeting_id_seq;
       public          admin    false    212            u           0    0    meeting_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.meeting_id_seq OWNED BY public.meeting.id;
          public          admin    false    211            ?            1259    16446    participant    TABLE        CREATE TABLE public.participant (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    status integer,
    developer_id bigint NOT NULL
);
    DROP TABLE public.participant;
       public         heap    admin    false            ?            1259    16444    participant_id_seq    SEQUENCE     {   CREATE SEQUENCE public.participant_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.participant_id_seq;
       public          admin    false    214            v           0    0    participant_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.participant_id_seq OWNED BY public.participant.id;
          public          admin    false    213            ?            1259    16454    person    TABLE     r  CREATE TABLE public.person (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    email character varying(255),
    name character varying(255),
    nickname character varying(255),
    password character varying(255)
);
    DROP TABLE public.person;
       public         heap    admin    false            ?            1259    16452    person_id_seq    SEQUENCE     v   CREATE SEQUENCE public.person_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.person_id_seq;
       public          admin    false    216            w           0    0    person_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.person_id_seq OWNED BY public.person.id;
          public          admin    false    215            ?            1259    16465    product_backlog    TABLE     ?   CREATE TABLE public.product_backlog (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone
);
 #   DROP TABLE public.product_backlog;
       public         heap    admin    false            ?            1259    16463    product_backlog_id_seq    SEQUENCE        CREATE SEQUENCE public.product_backlog_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.product_backlog_id_seq;
       public          admin    false    218            x           0    0    product_backlog_id_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.product_backlog_id_seq OWNED BY public.product_backlog.id;
          public          admin    false    217            ?            1259    16473    product_owner    TABLE     +  CREATE TABLE public.product_owner (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    company_id bigint NOT NULL,
    person_id bigint NOT NULL
);
 !   DROP TABLE public.product_owner;
       public         heap    admin    false            ?            1259    16471    product_owner_id_seq    SEQUENCE     }   CREATE SEQUENCE public.product_owner_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.product_owner_id_seq;
       public          admin    false    220            y           0    0    product_owner_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.product_owner_id_seq OWNED BY public.product_owner.id;
          public          admin    false    219            ?            1259    16481    project    TABLE     -  CREATE TABLE public.project (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    deadline timestamp without time zone,
    description character varying(255),
    logo character varying(255),
    name character varying(255),
    start_date timestamp without time zone,
    status integer,
    product_backlog_id bigint NOT NULL,
    product_owner_id bigint NOT NULL,
    scrum_master_id bigint NOT NULL
);
    DROP TABLE public.project;
       public         heap    admin    false            ?            1259    16479    project_id_seq    SEQUENCE     w   CREATE SEQUENCE public.project_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.project_id_seq;
       public          admin    false    222            z           0    0    project_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.project_id_seq OWNED BY public.project.id;
          public          admin    false    221            ?            1259    16492    scrum_master    TABLE     
  CREATE TABLE public.scrum_master (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    person_id bigint NOT NULL
);
     DROP TABLE public.scrum_master;
       public         heap    admin    false            ?            1259    16490    scrum_master_id_seq    SEQUENCE     |   CREATE SEQUENCE public.scrum_master_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.scrum_master_id_seq;
       public          admin    false    224            {           0    0    scrum_master_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.scrum_master_id_seq OWNED BY public.scrum_master.id;
          public          admin    false    223            ?            1259    16500    sprint    TABLE     Q  CREATE TABLE public.sprint (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    duration integer,
    end_date timestamp without time zone,
    start_date timestamp without time zone
);
    DROP TABLE public.sprint;
       public         heap    admin    false            ?            1259    16506    sprint_activity    TABLE     h   CREATE TABLE public.sprint_activity (
    activity_id bigint NOT NULL,
    sprint_id bigint NOT NULL
);
 #   DROP TABLE public.sprint_activity;
       public         heap    admin    false            ?            1259    16498    sprint_id_seq    SEQUENCE     v   CREATE SEQUENCE public.sprint_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.sprint_id_seq;
       public          admin    false    226            |           0    0    sprint_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.sprint_id_seq OWNED BY public.sprint.id;
          public          admin    false    225            ?            1259    16513    user_storie    TABLE     ?  CREATE TABLE public.user_storie (
    id bigint NOT NULL,
    active boolean,
    creation_date timestamp without time zone NOT NULL,
    deletion_date timestamp without time zone,
    modification_date timestamp without time zone,
    acceptancecriterion character varying(255),
    description character varying(255),
    status integer,
    title character varying(255),
    product_backlog_id bigint NOT NULL,
    storie_id bigint
);
    DROP TABLE public.user_storie;
       public         heap    admin    false            ?            1259    16511    user_storie_id_seq    SEQUENCE     {   CREATE SEQUENCE public.user_storie_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.user_storie_id_seq;
       public          admin    false    229            }           0    0    user_storie_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.user_storie_id_seq OWNED BY public.user_storie.id;
          public          admin    false    228            ?           2604    16390    activity id    DEFAULT     j   ALTER TABLE ONLY public.activity ALTER COLUMN id SET DEFAULT nextval('public.activity_id_seq'::regclass);
 :   ALTER TABLE public.activity ALTER COLUMN id DROP DEFAULT;
       public          admin    false    200    201    201            ?           2604    16398 
   company id    DEFAULT     h   ALTER TABLE ONLY public.company ALTER COLUMN id SET DEFAULT nextval('public.company_id_seq'::regclass);
 9   ALTER TABLE public.company ALTER COLUMN id DROP DEFAULT;
       public          admin    false    202    203    203            ?           2604    16409    dev_team id    DEFAULT     j   ALTER TABLE ONLY public.dev_team ALTER COLUMN id SET DEFAULT nextval('public.dev_team_id_seq'::regclass);
 :   ALTER TABLE public.dev_team ALTER COLUMN id DROP DEFAULT;
       public          admin    false    204    205    205            ?           2604    16422    developer id    DEFAULT     l   ALTER TABLE ONLY public.developer ALTER COLUMN id SET DEFAULT nextval('public.developer_id_seq'::regclass);
 ;   ALTER TABLE public.developer ALTER COLUMN id DROP DEFAULT;
       public          admin    false    207    208    208            ?           2604    16430    guest id    DEFAULT     d   ALTER TABLE ONLY public.guest ALTER COLUMN id SET DEFAULT nextval('public.guest_id_seq'::regclass);
 7   ALTER TABLE public.guest ALTER COLUMN id DROP DEFAULT;
       public          admin    false    209    210    210            ?           2604    16438 
   meeting id    DEFAULT     h   ALTER TABLE ONLY public.meeting ALTER COLUMN id SET DEFAULT nextval('public.meeting_id_seq'::regclass);
 9   ALTER TABLE public.meeting ALTER COLUMN id DROP DEFAULT;
       public          admin    false    212    211    212            ?           2604    16449    participant id    DEFAULT     p   ALTER TABLE ONLY public.participant ALTER COLUMN id SET DEFAULT nextval('public.participant_id_seq'::regclass);
 =   ALTER TABLE public.participant ALTER COLUMN id DROP DEFAULT;
       public          admin    false    214    213    214            ?           2604    16457 	   person id    DEFAULT     f   ALTER TABLE ONLY public.person ALTER COLUMN id SET DEFAULT nextval('public.person_id_seq'::regclass);
 8   ALTER TABLE public.person ALTER COLUMN id DROP DEFAULT;
       public          admin    false    216    215    216            ?           2604    16468    product_backlog id    DEFAULT     x   ALTER TABLE ONLY public.product_backlog ALTER COLUMN id SET DEFAULT nextval('public.product_backlog_id_seq'::regclass);
 A   ALTER TABLE public.product_backlog ALTER COLUMN id DROP DEFAULT;
       public          admin    false    218    217    218            ?           2604    16476    product_owner id    DEFAULT     t   ALTER TABLE ONLY public.product_owner ALTER COLUMN id SET DEFAULT nextval('public.product_owner_id_seq'::regclass);
 ?   ALTER TABLE public.product_owner ALTER COLUMN id DROP DEFAULT;
       public          admin    false    220    219    220            ?           2604    16484 
   project id    DEFAULT     h   ALTER TABLE ONLY public.project ALTER COLUMN id SET DEFAULT nextval('public.project_id_seq'::regclass);
 9   ALTER TABLE public.project ALTER COLUMN id DROP DEFAULT;
       public          admin    false    222    221    222            ?           2604    16495    scrum_master id    DEFAULT     r   ALTER TABLE ONLY public.scrum_master ALTER COLUMN id SET DEFAULT nextval('public.scrum_master_id_seq'::regclass);
 >   ALTER TABLE public.scrum_master ALTER COLUMN id DROP DEFAULT;
       public          admin    false    224    223    224            ?           2604    16503 	   sprint id    DEFAULT     f   ALTER TABLE ONLY public.sprint ALTER COLUMN id SET DEFAULT nextval('public.sprint_id_seq'::regclass);
 8   ALTER TABLE public.sprint ALTER COLUMN id DROP DEFAULT;
       public          admin    false    226    225    226            ?           2604    16516    user_storie id    DEFAULT     p   ALTER TABLE ONLY public.user_storie ALTER COLUMN id SET DEFAULT nextval('public.user_storie_id_seq'::regclass);
 =   ALTER TABLE public.user_storie ALTER COLUMN id DROP DEFAULT;
       public          admin    false    229    228    229            M          0    16387    activity 
   TABLE DATA           ?   COPY public.activity (id, active, creation_date, deletion_date, modification_date, project_id, developer_id, user_storie_id) FROM stdin;
    public          admin    false    201   ??       O          0    16395    company 
   TABLE DATA           j   COPY public.company (id, active, creation_date, deletion_date, modification_date, cnpj, name) FROM stdin;
    public          admin    false    203   ?       Q          0    16406    dev_team 
   TABLE DATA           t   COPY public.dev_team (id, active, creation_date, deletion_date, modification_date, surname, project_id) FROM stdin;
    public          admin    false    205   q?       R          0    16412    dev_team_participant 
   TABLE DATA           K   COPY public.dev_team_participant (participant_id, dev_team_id) FROM stdin;
    public          admin    false    206   ??       T          0    16419 	   developer 
   TABLE DATA           k   COPY public.developer (id, active, creation_date, deletion_date, modification_date, person_id) FROM stdin;
    public          admin    false    208   ??       V          0    16427    guest 
   TABLE DATA           ?   COPY public.guest (id, active, creation_date, deletion_date, modification_date, category, meeting_id, person_id, guest_id) FROM stdin;
    public          admin    false    210   Ȧ       X          0    16435    meeting 
   TABLE DATA           ?   COPY public.meeting (id, active, creation_date, deletion_date, modification_date, category, datetime, description, link, project_id) FROM stdin;
    public          admin    false    212   ??       Z          0    16446    participant 
   TABLE DATA           x   COPY public.participant (id, active, creation_date, deletion_date, modification_date, status, developer_id) FROM stdin;
    public          admin    false    214   ?       \          0    16454    person 
   TABLE DATA           ~   COPY public.person (id, active, creation_date, deletion_date, modification_date, email, name, nickname, password) FROM stdin;
    public          admin    false    216   ?       ^          0    16465    product_backlog 
   TABLE DATA           f   COPY public.product_backlog (id, active, creation_date, deletion_date, modification_date) FROM stdin;
    public          admin    false    218   ??       `          0    16473    product_owner 
   TABLE DATA           {   COPY public.product_owner (id, active, creation_date, deletion_date, modification_date, company_id, person_id) FROM stdin;
    public          admin    false    220   ??       b          0    16481    project 
   TABLE DATA           ?   COPY public.project (id, active, creation_date, deletion_date, modification_date, deadline, description, logo, name, start_date, status, product_backlog_id, product_owner_id, scrum_master_id) FROM stdin;
    public          admin    false    222   ;?       d          0    16492    scrum_master 
   TABLE DATA           n   COPY public.scrum_master (id, active, creation_date, deletion_date, modification_date, person_id) FROM stdin;
    public          admin    false    224   ??       f          0    16500    sprint 
   TABLE DATA           }   COPY public.sprint (id, active, creation_date, deletion_date, modification_date, duration, end_date, start_date) FROM stdin;
    public          admin    false    226   ݨ       g          0    16506    sprint_activity 
   TABLE DATA           A   COPY public.sprint_activity (activity_id, sprint_id) FROM stdin;
    public          admin    false    227   ??       i          0    16513    user_storie 
   TABLE DATA           ?   COPY public.user_storie (id, active, creation_date, deletion_date, modification_date, acceptancecriterion, description, status, title, product_backlog_id, storie_id) FROM stdin;
    public          admin    false    229   ?       ~           0    0    activity_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.activity_id_seq', 1, false);
          public          admin    false    200                       0    0    company_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.company_id_seq', 1, true);
          public          admin    false    202            ?           0    0    dev_team_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.dev_team_id_seq', 1, false);
          public          admin    false    204            ?           0    0    developer_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.developer_id_seq', 1, false);
          public          admin    false    207            ?           0    0    guest_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.guest_id_seq', 1, false);
          public          admin    false    209            ?           0    0    meeting_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.meeting_id_seq', 1, false);
          public          admin    false    211            ?           0    0    participant_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.participant_id_seq', 1, false);
          public          admin    false    213            ?           0    0    person_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.person_id_seq', 3, true);
          public          admin    false    215            ?           0    0    product_backlog_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.product_backlog_id_seq', 1, true);
          public          admin    false    217            ?           0    0    product_owner_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.product_owner_id_seq', 1, true);
          public          admin    false    219            ?           0    0    project_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.project_id_seq', 1, true);
          public          admin    false    221            ?           0    0    scrum_master_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.scrum_master_id_seq', 1, true);
          public          admin    false    223            ?           0    0    sprint_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.sprint_id_seq', 1, false);
          public          admin    false    225            ?           0    0    user_storie_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.user_storie_id_seq', 1, false);
          public          admin    false    228            ?           2606    16392    activity activity_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.activity
    ADD CONSTRAINT activity_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.activity DROP CONSTRAINT activity_pkey;
       public            admin    false    201            ?           2606    16403    company company_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.company
    ADD CONSTRAINT company_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.company DROP CONSTRAINT company_pkey;
       public            admin    false    203            ?           2606    16416 .   dev_team_participant dev_team_participant_pkey 
   CONSTRAINT     ?   ALTER TABLE ONLY public.dev_team_participant
    ADD CONSTRAINT dev_team_participant_pkey PRIMARY KEY (participant_id, dev_team_id);
 X   ALTER TABLE ONLY public.dev_team_participant DROP CONSTRAINT dev_team_participant_pkey;
       public            admin    false    206    206            ?           2606    16411    dev_team dev_team_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.dev_team
    ADD CONSTRAINT dev_team_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.dev_team DROP CONSTRAINT dev_team_pkey;
       public            admin    false    205            ?           2606    16424    developer developer_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.developer
    ADD CONSTRAINT developer_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.developer DROP CONSTRAINT developer_pkey;
       public            admin    false    208            ?           2606    16432    guest guest_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.guest
    ADD CONSTRAINT guest_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.guest DROP CONSTRAINT guest_pkey;
       public            admin    false    210            ?           2606    16443    meeting meeting_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.meeting
    ADD CONSTRAINT meeting_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.meeting DROP CONSTRAINT meeting_pkey;
       public            admin    false    212            ?           2606    16451    participant participant_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.participant
    ADD CONSTRAINT participant_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.participant DROP CONSTRAINT participant_pkey;
       public            admin    false    214            ?           2606    16462    person person_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.person
    ADD CONSTRAINT person_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.person DROP CONSTRAINT person_pkey;
       public            admin    false    216            ?           2606    16470 $   product_backlog product_backlog_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.product_backlog
    ADD CONSTRAINT product_backlog_pkey PRIMARY KEY (id);
 N   ALTER TABLE ONLY public.product_backlog DROP CONSTRAINT product_backlog_pkey;
       public            admin    false    218            ?           2606    16478     product_owner product_owner_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.product_owner
    ADD CONSTRAINT product_owner_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.product_owner DROP CONSTRAINT product_owner_pkey;
       public            admin    false    220            ?           2606    16489    project project_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.project
    ADD CONSTRAINT project_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.project DROP CONSTRAINT project_pkey;
       public            admin    false    222            ?           2606    16497    scrum_master scrum_master_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.scrum_master
    ADD CONSTRAINT scrum_master_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.scrum_master DROP CONSTRAINT scrum_master_pkey;
       public            admin    false    224            ?           2606    16510 $   sprint_activity sprint_activity_pkey 
   CONSTRAINT     v   ALTER TABLE ONLY public.sprint_activity
    ADD CONSTRAINT sprint_activity_pkey PRIMARY KEY (activity_id, sprint_id);
 N   ALTER TABLE ONLY public.sprint_activity DROP CONSTRAINT sprint_activity_pkey;
       public            admin    false    227    227            ?           2606    16505    sprint sprint_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.sprint
    ADD CONSTRAINT sprint_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.sprint DROP CONSTRAINT sprint_pkey;
       public            admin    false    226            ?           2606    16527 #   person uk_53livefdhvt5kn9qs5vwcey8o 
   CONSTRAINT     b   ALTER TABLE ONLY public.person
    ADD CONSTRAINT uk_53livefdhvt5kn9qs5vwcey8o UNIQUE (nickname);
 M   ALTER TABLE ONLY public.person DROP CONSTRAINT uk_53livefdhvt5kn9qs5vwcey8o;
       public            admin    false    216            ?           2606    16523 $   company uk_bg2tfjjhyqxens7cw8a4uhscw 
   CONSTRAINT     _   ALTER TABLE ONLY public.company
    ADD CONSTRAINT uk_bg2tfjjhyqxens7cw8a4uhscw UNIQUE (cnpj);
 N   ALTER TABLE ONLY public.company DROP CONSTRAINT uk_bg2tfjjhyqxens7cw8a4uhscw;
       public            admin    false    203            ?           2606    16525 #   person uk_fwmwi44u55bo4rvwsv0cln012 
   CONSTRAINT     _   ALTER TABLE ONLY public.person
    ADD CONSTRAINT uk_fwmwi44u55bo4rvwsv0cln012 UNIQUE (email);
 M   ALTER TABLE ONLY public.person DROP CONSTRAINT uk_fwmwi44u55bo4rvwsv0cln012;
       public            admin    false    216            ?           2606    16521    user_storie user_storie_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.user_storie
    ADD CONSTRAINT user_storie_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.user_storie DROP CONSTRAINT user_storie_pkey;
       public            admin    false    229            ?           2606    16533 $   activity fk2888bk8pbkmp3h0g1iuvdiin0    FK CONSTRAINT     ?   ALTER TABLE ONLY public.activity
    ADD CONSTRAINT fk2888bk8pbkmp3h0g1iuvdiin0 FOREIGN KEY (developer_id) REFERENCES public.developer(id);
 N   ALTER TABLE ONLY public.activity DROP CONSTRAINT fk2888bk8pbkmp3h0g1iuvdiin0;
       public          admin    false    201    208    2969            ?           2606    16538 $   activity fk30vpikp0f8xg0g9ffw9qar7qb    FK CONSTRAINT     ?   ALTER TABLE ONLY public.activity
    ADD CONSTRAINT fk30vpikp0f8xg0g9ffw9qar7qb FOREIGN KEY (user_storie_id) REFERENCES public.user_storie(id);
 N   ALTER TABLE ONLY public.activity DROP CONSTRAINT fk30vpikp0f8xg0g9ffw9qar7qb;
       public          admin    false    229    201    2995            ?           2606    16593 )   product_owner fk3pduj7y5iufpg0bkox85ubs3j    FK CONSTRAINT     ?   ALTER TABLE ONLY public.product_owner
    ADD CONSTRAINT fk3pduj7y5iufpg0bkox85ubs3j FOREIGN KEY (person_id) REFERENCES public.person(id);
 S   ALTER TABLE ONLY public.product_owner DROP CONSTRAINT fk3pduj7y5iufpg0bkox85ubs3j;
       public          admin    false    220    216    2977            ?           2606    16618 +   sprint_activity fk3qjcvquab5vioseb3s605p7kh    FK CONSTRAINT     ?   ALTER TABLE ONLY public.sprint_activity
    ADD CONSTRAINT fk3qjcvquab5vioseb3s605p7kh FOREIGN KEY (sprint_id) REFERENCES public.activity(id);
 U   ALTER TABLE ONLY public.sprint_activity DROP CONSTRAINT fk3qjcvquab5vioseb3s605p7kh;
       public          admin    false    201    2959    227            ?           2606    16613 (   scrum_master fk53my42klxbx2y8tmiy0jjjglb    FK CONSTRAINT     ?   ALTER TABLE ONLY public.scrum_master
    ADD CONSTRAINT fk53my42klxbx2y8tmiy0jjjglb FOREIGN KEY (person_id) REFERENCES public.person(id);
 R   ALTER TABLE ONLY public.scrum_master DROP CONSTRAINT fk53my42klxbx2y8tmiy0jjjglb;
       public          admin    false    2977    224    216            ?           2606    16578 #   meeting fk7klmberb8tvp3dejg0yf1ehpf    FK CONSTRAINT     ?   ALTER TABLE ONLY public.meeting
    ADD CONSTRAINT fk7klmberb8tvp3dejg0yf1ehpf FOREIGN KEY (project_id) REFERENCES public.project(id);
 M   ALTER TABLE ONLY public.meeting DROP CONSTRAINT fk7klmberb8tvp3dejg0yf1ehpf;
       public          admin    false    2987    222    212            ?           2606    16558 %   developer fk7tudpsl9b379xvodrm1fb9rp0    FK CONSTRAINT     ?   ALTER TABLE ONLY public.developer
    ADD CONSTRAINT fk7tudpsl9b379xvodrm1fb9rp0 FOREIGN KEY (person_id) REFERENCES public.person(id);
 O   ALTER TABLE ONLY public.developer DROP CONSTRAINT fk7tudpsl9b379xvodrm1fb9rp0;
       public          admin    false    208    216    2977            ?           2606    16588 )   product_owner fk850vig0w41vuya7bq9pr3ronp    FK CONSTRAINT     ?   ALTER TABLE ONLY public.product_owner
    ADD CONSTRAINT fk850vig0w41vuya7bq9pr3ronp FOREIGN KEY (company_id) REFERENCES public.company(id);
 S   ALTER TABLE ONLY public.product_owner DROP CONSTRAINT fk850vig0w41vuya7bq9pr3ronp;
       public          admin    false    220    2961    203            ?           2606    16628 '   user_storie fk8t0jyco74hk4ste5vyypriyug    FK CONSTRAINT     ?   ALTER TABLE ONLY public.user_storie
    ADD CONSTRAINT fk8t0jyco74hk4ste5vyypriyug FOREIGN KEY (product_backlog_id) REFERENCES public.product_backlog(id);
 Q   ALTER TABLE ONLY public.user_storie DROP CONSTRAINT fk8t0jyco74hk4ste5vyypriyug;
       public          admin    false    2983    218    229            ?           2606    16633 '   user_storie fk9uwreux83geq5yek5b7ymmbtv    FK CONSTRAINT     ?   ALTER TABLE ONLY public.user_storie
    ADD CONSTRAINT fk9uwreux83geq5yek5b7ymmbtv FOREIGN KEY (storie_id) REFERENCES public.product_backlog(id);
 Q   ALTER TABLE ONLY public.user_storie DROP CONSTRAINT fk9uwreux83geq5yek5b7ymmbtv;
       public          admin    false    218    229    2983            ?           2606    16553 0   dev_team_participant fkc8pajam5fn9tc98o04r0odfve    FK CONSTRAINT     ?   ALTER TABLE ONLY public.dev_team_participant
    ADD CONSTRAINT fkc8pajam5fn9tc98o04r0odfve FOREIGN KEY (participant_id) REFERENCES public.dev_team(id);
 Z   ALTER TABLE ONLY public.dev_team_participant DROP CONSTRAINT fkc8pajam5fn9tc98o04r0odfve;
       public          admin    false    206    2965    205            ?           2606    16563 !   guest fkdetsf4pkqsbxa7r93i8ffnhly    FK CONSTRAINT     ?   ALTER TABLE ONLY public.guest
    ADD CONSTRAINT fkdetsf4pkqsbxa7r93i8ffnhly FOREIGN KEY (meeting_id) REFERENCES public.meeting(id);
 K   ALTER TABLE ONLY public.guest DROP CONSTRAINT fkdetsf4pkqsbxa7r93i8ffnhly;
       public          admin    false    210    212    2973            ?           2606    16608 #   project fkdftk2ffr46yxaik6vld8hv15e    FK CONSTRAINT     ?   ALTER TABLE ONLY public.project
    ADD CONSTRAINT fkdftk2ffr46yxaik6vld8hv15e FOREIGN KEY (scrum_master_id) REFERENCES public.scrum_master(id);
 M   ALTER TABLE ONLY public.project DROP CONSTRAINT fkdftk2ffr46yxaik6vld8hv15e;
       public          admin    false    2989    224    222            ?           2606    16623 +   sprint_activity fkdxqldiatmq85gm60vf1umnlvl    FK CONSTRAINT     ?   ALTER TABLE ONLY public.sprint_activity
    ADD CONSTRAINT fkdxqldiatmq85gm60vf1umnlvl FOREIGN KEY (activity_id) REFERENCES public.sprint(id);
 U   ALTER TABLE ONLY public.sprint_activity DROP CONSTRAINT fkdxqldiatmq85gm60vf1umnlvl;
       public          admin    false    227    2991    226            ?           2606    16568 !   guest fklqin7h2a36utn3i70gubmrnu6    FK CONSTRAINT     ?   ALTER TABLE ONLY public.guest
    ADD CONSTRAINT fklqin7h2a36utn3i70gubmrnu6 FOREIGN KEY (person_id) REFERENCES public.person(id);
 K   ALTER TABLE ONLY public.guest DROP CONSTRAINT fklqin7h2a36utn3i70gubmrnu6;
       public          admin    false    2977    216    210            ?           2606    16598 #   project fkmxye7pu7en1sujfxeletrjj2w    FK CONSTRAINT     ?   ALTER TABLE ONLY public.project
    ADD CONSTRAINT fkmxye7pu7en1sujfxeletrjj2w FOREIGN KEY (product_backlog_id) REFERENCES public.product_backlog(id);
 M   ALTER TABLE ONLY public.project DROP CONSTRAINT fkmxye7pu7en1sujfxeletrjj2w;
       public          admin    false    222    2983    218            ?           2606    16528 $   activity fknhet5ajl85sdn6l77obdgh47s    FK CONSTRAINT     ?   ALTER TABLE ONLY public.activity
    ADD CONSTRAINT fknhet5ajl85sdn6l77obdgh47s FOREIGN KEY (project_id) REFERENCES public.project(id);
 N   ALTER TABLE ONLY public.activity DROP CONSTRAINT fknhet5ajl85sdn6l77obdgh47s;
       public          admin    false    222    201    2987            ?           2606    16583 '   participant fkpcv3v5tsowvqatx6rnjqpl4u9    FK CONSTRAINT     ?   ALTER TABLE ONLY public.participant
    ADD CONSTRAINT fkpcv3v5tsowvqatx6rnjqpl4u9 FOREIGN KEY (developer_id) REFERENCES public.developer(id);
 Q   ALTER TABLE ONLY public.participant DROP CONSTRAINT fkpcv3v5tsowvqatx6rnjqpl4u9;
       public          admin    false    208    214    2969            ?           2606    16548 0   dev_team_participant fkri04s2nflp4g11wkdqgd2mpoq    FK CONSTRAINT     ?   ALTER TABLE ONLY public.dev_team_participant
    ADD CONSTRAINT fkri04s2nflp4g11wkdqgd2mpoq FOREIGN KEY (dev_team_id) REFERENCES public.participant(id);
 Z   ALTER TABLE ONLY public.dev_team_participant DROP CONSTRAINT fkri04s2nflp4g11wkdqgd2mpoq;
       public          admin    false    2975    214    206            ?           2606    16573 !   guest fksc4cbrkitg4ds0ojdsrr9qt3g    FK CONSTRAINT     ?   ALTER TABLE ONLY public.guest
    ADD CONSTRAINT fksc4cbrkitg4ds0ojdsrr9qt3g FOREIGN KEY (guest_id) REFERENCES public.meeting(id);
 K   ALTER TABLE ONLY public.guest DROP CONSTRAINT fksc4cbrkitg4ds0ojdsrr9qt3g;
       public          admin    false    2973    210    212            ?           2606    16543 #   dev_team fkxc2ng31wq6j16rw6uyeqltc5    FK CONSTRAINT     ?   ALTER TABLE ONLY public.dev_team
    ADD CONSTRAINT fkxc2ng31wq6j16rw6uyeqltc5 FOREIGN KEY (project_id) REFERENCES public.project(id);
 M   ALTER TABLE ONLY public.dev_team DROP CONSTRAINT fkxc2ng31wq6j16rw6uyeqltc5;
       public          admin    false    205    2987    222            ?           2606    16603 "   project fkxt87b0apw7xeij0jn9jp5194    FK CONSTRAINT     ?   ALTER TABLE ONLY public.project
    ADD CONSTRAINT fkxt87b0apw7xeij0jn9jp5194 FOREIGN KEY (product_owner_id) REFERENCES public.product_owner(id);
 L   ALTER TABLE ONLY public.project DROP CONSTRAINT fkxt87b0apw7xeij0jn9jp5194;
       public          admin    false    2985    220    222            M      x?????? ? ?      O   H   x?3?,?4202?54?52W04?2??20?3?401???!3=sKC=3S#}C]K#N???̜T?=... ??      Q      x?????? ? ?      R      x?????? ? ?      T      x?????? ? ?      V      x?????? ? ?      X      x?????? ? ?      Z      x?????? ? ?      \   ?   x?m?A
?0???????$Q?U?/?p3X)BD?m??Kԅ????????!???????EG??z??\rg??k???A???8?)u?\,??????R6h?n?qG\?^?????,?\9*7$?Z?w?9??]??1_?06?      ^   0   x?3?,?4202?54?52W04?24?20?31?030???"?=... ?Z?      `   3   x?3?,?4202?54?52W04?24?2??32?473???!CN#?=... ??]      b   Q   x?3?,?4202?54?52W04?24?26?3?4643???!?c$?VF?z&?F?????ŕ
??E?????B W? ?j?      d   1   x?3?,?4202?54?52W04?2??21?3?0445???!C?=... ??"      f      x?????? ? ?      g      x?????? ? ?      i      x?????? ? ?     